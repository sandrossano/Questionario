package com.questionario.sandro.questionario;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

import static com.questionario.sandro.questionario.MainActivity.domanda_1;
import static com.questionario.sandro.questionario.MainActivity.domanda_10;
import static com.questionario.sandro.questionario.MainActivity.prefs;
import static com.questionario.sandro.questionario.MainActivity.risultato;
import static com.questionario.sandro.questionario.MainActivity.selezionata_1;
import static com.questionario.sandro.questionario.MainActivity.selezionata_10;
import static com.questionario.sandro.questionario.MainActivity.selezionata_2;
import static com.questionario.sandro.questionario.MainActivity.selezionata_3;
import static com.questionario.sandro.questionario.MainActivity.selezionata_4;
import static com.questionario.sandro.questionario.MainActivity.selezionata_5;
import static com.questionario.sandro.questionario.MainActivity.selezionata_6;
import static com.questionario.sandro.questionario.MainActivity.selezionata_7;
import static com.questionario.sandro.questionario.MainActivity.selezionata_8;
import static com.questionario.sandro.questionario.MainActivity.selezionata_9;


/**
 * Created by sandro on 02/07/18.
 */

public class Pagina_10 extends AppCompatActivity {
    SharedPreferences.Editor editor = prefs.edit();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_10);
    setTitle("Domanda 10");

    if(selezionata_10!=-1){
        if(selezionata_10==1){RadioButton radioButton=findViewById(R.id.radioButton); radioButton.setChecked(true);}
        if(selezionata_10==2){RadioButton radioButton2=findViewById(R.id.radioButton2); radioButton2.setChecked(true);}
        if(selezionata_10==3){RadioButton radioButton3=findViewById(R.id.radioButton3); radioButton3.setChecked(true);}
        if(selezionata_10==4){RadioButton radioButton4=findViewById(R.id.radioButton4); radioButton4.setChecked(true);}
    }

        if(risultato==true){
            findViewById(R.id.radioButton).setClickable(false);
            findViewById(R.id.radioButton2).setClickable(false);
            findViewById(R.id.radioButton3).setClickable(false);
            findViewById(R.id.radioButton4).setClickable(false);
            RadioButton radioButton=(RadioButton) findViewById(R.id.radioButton2);
            radioButton.setTextColor(Color.GREEN);
            //findViewById(R.id.button2).setVisibility(View.GONE);
        }

    domanda_10=true;
        editor.putBoolean("domanda_10",domanda_10);
        editor.apply();
    }

    @Override
    public void onBackPressed() {
        Intent i=new Intent(getApplicationContext(),Pagina_Domande.class);
        startActivity(i);
    }

    public void fatto_10(View view) {
        RadioButton radioButton2=findViewById(R.id.radioButton2);
        if(radioButton2.isChecked()){
            selezionata_10=2;}

        RadioButton radioButton1=findViewById(R.id.radioButton);
        if(radioButton1.isChecked()){
            selezionata_10=1;}

        RadioButton radioButton3=findViewById(R.id.radioButton3);
        if(radioButton3.isChecked()){
            selezionata_10=3;}

        RadioButton radioButton4=findViewById(R.id.radioButton4);
        if(radioButton4.isChecked()){
            selezionata_10=4;}

        if(selezionata_1==-1||selezionata_2==-1||selezionata_3==-1||selezionata_4==-1||
                selezionata_5==-1||selezionata_6==-1||selezionata_7==-1||selezionata_8==-1||
                selezionata_9==-1||selezionata_10==-1){
            editor.putInt("selezionata_10", selezionata_10);
            editor.apply();

            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Attenzione");
            alertDialog.setMessage("Devi completare tutte le domande per conoscere il risultato!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();

        }
        else {
            editor.putInt("selezionata_10", selezionata_10);
            editor.putBoolean("risultato", true);
            editor.apply();

            Intent i = new Intent(getApplicationContext(), Risultato.class);
            startActivity(i);
            finish();
        }
    }
}
