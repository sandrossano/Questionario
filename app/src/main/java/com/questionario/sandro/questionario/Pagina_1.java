package com.questionario.sandro.questionario;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import static com.questionario.sandro.questionario.MainActivity.contatore;
import static com.questionario.sandro.questionario.MainActivity.domanda_1;
import static com.questionario.sandro.questionario.MainActivity.prefs;
import static com.questionario.sandro.questionario.MainActivity.risultato;
import static com.questionario.sandro.questionario.MainActivity.selezionata_1;


/**
 * Created by sandro on 02/07/18.
 */

public class Pagina_1 extends AppCompatActivity {
    SharedPreferences.Editor editor = prefs.edit();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_1);
    setTitle("Domanda 1");

    if(selezionata_1!=-1){
        if(selezionata_1==1){RadioButton radioButton=findViewById(R.id.radioButton); radioButton.setChecked(true);}
        if(selezionata_1==2){RadioButton radioButton2=findViewById(R.id.radioButton2); radioButton2.setChecked(true);}
        if(selezionata_1==3){RadioButton radioButton3=findViewById(R.id.radioButton3); radioButton3.setChecked(true);}
        if(selezionata_1==4){RadioButton radioButton4=findViewById(R.id.radioButton4); radioButton4.setChecked(true);}
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

    domanda_1=true;
        editor.putBoolean("domanda_1",domanda_1);
        editor.apply();
    }

    @Override
    public void onBackPressed() {
        Intent i=new Intent(getApplicationContext(),Pagina_Domande.class);
        startActivity(i);
    }

    public void fatto_1(View view) {
        RadioButton radioButton2=findViewById(R.id.radioButton2);
        if(radioButton2.isChecked()){
            selezionata_1=2;}

        RadioButton radioButton1=findViewById(R.id.radioButton);
        if(radioButton1.isChecked()){
            selezionata_1=1;}

        RadioButton radioButton3=findViewById(R.id.radioButton3);
        if(radioButton3.isChecked()){
            selezionata_1=3;}

        RadioButton radioButton4=findViewById(R.id.radioButton4);
        if(radioButton4.isChecked()){
            selezionata_1=4;}

        editor.putInt("selezionata_1", selezionata_1);
        editor.putBoolean("domanda_2",true);
        editor.apply();

        Intent i=new Intent(getApplicationContext(),Pagina_2.class);
        startActivity(i);
        finish();
    }
}
