package com.questionario.sandro.questionario;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import static com.questionario.sandro.questionario.MainActivity.contatore;
import static com.questionario.sandro.questionario.MainActivity.domanda_10;
import static com.questionario.sandro.questionario.MainActivity.nome;
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

public class Risultato extends AppCompatActivity {
    SharedPreferences.Editor editor = prefs.edit();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.risultato);
    setTitle("Risultato");
    contatore=0;
        if(selezionata_1==2)contatore++;
        if(selezionata_2==2)contatore++;
        if(selezionata_3==2)contatore++;
        if(selezionata_4==2)contatore++;
        if(selezionata_5==2)contatore++;
        if(selezionata_6==2)contatore++;
        if(selezionata_7==2)contatore++;
        if(selezionata_8==2)contatore++;
        if(selezionata_9==2)contatore++;
        if(selezionata_10==2)contatore++;

        editor.putInt("contatore", contatore);
    TextView complimenti=findViewById(R.id.textView2);
    complimenti.setText("COMPLIMENTI "+nome+" HAI RISPOSTO CORRETTAMENTE A  "+contatore+" SU 10");

    risultato=true;
        editor.putBoolean("risultato",risultato);
        editor.apply();
    }

    @Override
    public void onBackPressed() {
        Intent i=new Intent(getApplicationContext(),Pagina_Domande.class);
        startActivity(i);
    }

    public void indietro(View view) {

        Intent i=new Intent(getApplicationContext(),Pagina_Domande.class);
        startActivity(i);
    }
}
