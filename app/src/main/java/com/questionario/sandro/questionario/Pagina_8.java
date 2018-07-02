package com.questionario.sandro.questionario;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

import static com.questionario.sandro.questionario.MainActivity.domanda_1;
import static com.questionario.sandro.questionario.MainActivity.domanda_8;
import static com.questionario.sandro.questionario.MainActivity.prefs;
import static com.questionario.sandro.questionario.MainActivity.risultato;
import static com.questionario.sandro.questionario.MainActivity.selezionata_3;
import static com.questionario.sandro.questionario.MainActivity.selezionata_7;
import static com.questionario.sandro.questionario.MainActivity.selezionata_8;


/**
 * Created by sandro on 02/07/18.
 */

public class Pagina_8 extends AppCompatActivity {
    SharedPreferences.Editor editor = prefs.edit();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_8);
    setTitle("Domanda 8");

    if(selezionata_8!=-1){
        if(selezionata_8==1){RadioButton radioButton=findViewById(R.id.radioButton); radioButton.setChecked(true);}
        if(selezionata_8==2){RadioButton radioButton2=findViewById(R.id.radioButton2); radioButton2.setChecked(true);}
        if(selezionata_8==3){RadioButton radioButton3=findViewById(R.id.radioButton3); radioButton3.setChecked(true);}
        if(selezionata_8==4){RadioButton radioButton4=findViewById(R.id.radioButton4); radioButton4.setChecked(true);}
    }

        if(risultato==true){
            findViewById(R.id.radioButton).setClickable(false);
            findViewById(R.id.radioButton2).setClickable(false);
            findViewById(R.id.radioButton3).setClickable(false);
            findViewById(R.id.radioButton4).setClickable(false);
            RadioButton radioButton=(RadioButton) findViewById(R.id.radioButton2);
            radioButton.setTextColor(Color.GREEN);
            findViewById(R.id.button2).setVisibility(View.GONE);
        }

    domanda_8=true;
        editor.putBoolean("domanda_8",domanda_8);
        editor.apply();
    }

    @Override
    public void onBackPressed() {
        Intent i=new Intent(getApplicationContext(),Pagina_Domande.class);
        startActivity(i);
    }

    public void fatto_8(View view) {
        RadioButton radioButton2=findViewById(R.id.radioButton2);
        if(radioButton2.isChecked()){
            selezionata_8=2;}

        RadioButton radioButton1=findViewById(R.id.radioButton);
        if(radioButton1.isChecked()){
            selezionata_8=1;}

        RadioButton radioButton3=findViewById(R.id.radioButton3);
        if(radioButton3.isChecked()){
            selezionata_8=3;}

        RadioButton radioButton4=findViewById(R.id.radioButton4);
        if(radioButton4.isChecked()){
            selezionata_8=4;}

        editor.putInt("selezionata_8", selezionata_8);
        editor.putBoolean("domanda_9",true);
        editor.apply();

        Intent i=new Intent(getApplicationContext(),Pagina_9.class);
        startActivity(i);
        finish();
    }
}
