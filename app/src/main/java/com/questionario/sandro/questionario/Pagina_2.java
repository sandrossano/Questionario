package com.questionario.sandro.questionario;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.view.View;
import android.widget.RadioButton;

import static com.questionario.sandro.questionario.MainActivity.domanda_1;
import static com.questionario.sandro.questionario.MainActivity.domanda_2;
import static com.questionario.sandro.questionario.MainActivity.prefs;
import static com.questionario.sandro.questionario.MainActivity.risultato;
import static com.questionario.sandro.questionario.MainActivity.selezionata_1;
import static com.questionario.sandro.questionario.MainActivity.selezionata_2;


/**
 * Created by sandro on 02/07/18.
 */

public class Pagina_2 extends AppCompatActivity {
    SharedPreferences.Editor editor = prefs.edit();

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Explode entertransition= new Explode();
        entertransition.setDuration(500);
        getWindow().setEnterTransition(entertransition);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_2);
    setTitle("Domanda 2");
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.color_back));

    if(selezionata_2!=-1){
        if(selezionata_2==1){RadioButton radioButton=findViewById(R.id.radioButton); radioButton.setChecked(true);}
        if(selezionata_2==2){RadioButton radioButton2=findViewById(R.id.radioButton2); radioButton2.setChecked(true);}
        if(selezionata_2==3){RadioButton radioButton3=findViewById(R.id.radioButton3); radioButton3.setChecked(true);}
        if(selezionata_2==4){RadioButton radioButton4=findViewById(R.id.radioButton4); radioButton4.setChecked(true);}
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

    domanda_2=true;
        editor.putBoolean("domanda_2",domanda_2);
        editor.apply();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBackPressed() {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_Domande.class);
        startActivity(i,options.toBundle());
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void fatto_2(View view) {
        RadioButton radioButton2=findViewById(R.id.radioButton2);
        if(radioButton2.isChecked()){
            selezionata_2=2;}

        RadioButton radioButton1=findViewById(R.id.radioButton);
        if(radioButton1.isChecked()){
            selezionata_2=1;}

        RadioButton radioButton3=findViewById(R.id.radioButton3);
        if(radioButton3.isChecked()){
            selezionata_2=3;}

        RadioButton radioButton4=findViewById(R.id.radioButton4);
        if(radioButton4.isChecked()){
            selezionata_2=4;}

        editor.putInt("selezionata_2", selezionata_2);
        editor.putBoolean("domanda_3",true);
        editor.apply();


        Intent i=new Intent(getApplicationContext(),Pagina_3.class);
        startActivity(i);
        overridePendingTransition(R.anim.fadein,R.anim.fadeout);
        finishAfterTransition();
    }
}
