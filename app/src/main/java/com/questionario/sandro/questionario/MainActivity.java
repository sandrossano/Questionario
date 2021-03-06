package com.questionario.sandro.questionario;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.DataSetObserver;
import android.os.Build;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    static String nome="";

    static int contatore=0;
    static int contatore_imm=0;
    static int contatore_4_imm=0;

    static boolean domanda_4_imm_1=false;
    static int selezionata_4_imm_1=-1;
    static boolean domanda_4_imm_2=false;
    static int selezionata_4_imm_2=-1;
    static boolean domanda_4_imm_3=false;
    static int selezionata_4_imm_3=-1;
    static boolean domanda_4_imm_4=false;
    static int selezionata_4_imm_4=-1;
    static boolean domanda_4_imm_5=false;
    static int selezionata_4_imm_5=-1;
    static boolean domanda_4_imm_6=false;
    static int selezionata_4_imm_6=-1;
    static boolean domanda_4_imm_7=false;
    static int selezionata_4_imm_7=-1;
    static boolean domanda_4_imm_8=false;
    static int selezionata_4_imm_8=-1;
    static boolean domanda_4_imm_9=false;
    static int selezionata_4_imm_9=-1;
    static boolean domanda_4_imm_10=false;
    static int selezionata_4_imm_10=-1;
    static boolean risultato_4_imm=false;

    static boolean domanda_imm_1=false;
    static int selezionata_imm_1=-1;
    static boolean domanda_imm_2=false;
    static int selezionata_imm_2=-1;
    static boolean domanda_imm_3=false;
    static int selezionata_imm_3=-1;
    static boolean domanda_imm_4=false;
    static int selezionata_imm_4=-1;
    static boolean domanda_imm_5=false;
    static int selezionata_imm_5=-1;
    static boolean domanda_imm_6=false;
    static int selezionata_imm_6=-1;
    static boolean domanda_imm_7=false;
    static int selezionata_imm_7=-1;
    static boolean domanda_imm_8=false;
    static int selezionata_imm_8=-1;
    static boolean domanda_imm_9=false;
    static int selezionata_imm_9=-1;
    static boolean domanda_imm_10=false;
    static int selezionata_imm_10=-1;
    static boolean risultato_imm=false;

    static boolean domanda_1=false;
    static int selezionata_1=-1;
    static boolean domanda_2=false;
    static int selezionata_2=-1;
    static boolean domanda_3=false;
    static int selezionata_3=-1;
    static boolean domanda_4=false;
    static int selezionata_4=-1;
    static boolean domanda_5=false;
    static int selezionata_5=-1;
    static boolean domanda_6=false;
    static int selezionata_6=-1;
    static boolean domanda_7=false;
    static int selezionata_7=-1;
    static boolean domanda_8=false;
    static int selezionata_8=-1;
    static boolean domanda_9=false;
    static int selezionata_9=-1;
    static boolean domanda_10=false;
    static int selezionata_10=-1;
    static boolean risultato=false;
    static String casata="";

    static SharedPreferences prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prefs = getSharedPreferences("salvataggio_account", MODE_PRIVATE);

        domanda_1 = prefs.getBoolean("domanda_1", false);
        selezionata_1 = prefs.getInt("selezionata_1", -1);
        domanda_2 = prefs.getBoolean("domanda_2", false);
        selezionata_2 = prefs.getInt("selezionata_2", -1);
        domanda_3 = prefs.getBoolean("domanda_3", false);
        selezionata_3 = prefs.getInt("selezionata_3", -1);
        domanda_4 = prefs.getBoolean("domanda_4", false);
        selezionata_4 = prefs.getInt("selezionata_4", -1);
        domanda_5 = prefs.getBoolean("domanda_5", false);
        selezionata_5 = prefs.getInt("selezionata_5", -1);
        domanda_6 = prefs.getBoolean("domanda_6", false);
        selezionata_6 = prefs.getInt("selezionata_6", -1);
        domanda_7 = prefs.getBoolean("domanda_7", false);
        selezionata_7 = prefs.getInt("selezionata_7", -1);
        domanda_8 = prefs.getBoolean("domanda_8", false);
        selezionata_8 = prefs.getInt("selezionata_8", -1);
        domanda_9 = prefs.getBoolean("domanda_9", false);
        selezionata_9 = prefs.getInt("selezionata_9", -1);
        domanda_10 = prefs.getBoolean("domanda_10", false);
        selezionata_10 = prefs.getInt("selezionata_10", -1);
        risultato = prefs.getBoolean("risultato", false);
        contatore = prefs.getInt("contatore", 0);

        domanda_imm_1 = prefs.getBoolean("domanda_imm_1", false);
        selezionata_imm_1 = prefs.getInt("selezionata_imm_1", -1);
        domanda_imm_2 = prefs.getBoolean("domanda_imm_2", false);
        selezionata_imm_2 = prefs.getInt("selezionata_imm_2", -1);
        domanda_imm_3 = prefs.getBoolean("domanda_imm_3", false);
        selezionata_imm_3 = prefs.getInt("selezionata_imm_3", -1);
        domanda_imm_4 = prefs.getBoolean("domanda_imm_4", false);
        selezionata_imm_4 = prefs.getInt("selezionata_imm_4", -1);
        domanda_imm_5 = prefs.getBoolean("domanda_imm_5", false);
        selezionata_imm_5 = prefs.getInt("selezionata_imm_5", -1);
        domanda_imm_6 = prefs.getBoolean("domanda_imm_6", false);
        selezionata_imm_6 = prefs.getInt("selezionata_imm_6", -1);
        domanda_imm_7 = prefs.getBoolean("domanda_imm_7", false);
        selezionata_imm_7 = prefs.getInt("selezionata_imm_7", -1);
        domanda_imm_8 = prefs.getBoolean("domanda_imm_8", false);
        selezionata_imm_8 = prefs.getInt("selezionata_imm_8", -1);
        domanda_imm_9 = prefs.getBoolean("domanda_imm_9", false);
        selezionata_imm_9 = prefs.getInt("selezionata_imm_9", -1);
        domanda_imm_10 = prefs.getBoolean("domanda_imm_10", false);
        selezionata_imm_10 = prefs.getInt("selezionata_imm_10", -1);
        risultato_imm = prefs.getBoolean("risultato_imm", false);
        contatore_imm = prefs.getInt("contatore_imm", 0);

        domanda_4_imm_1 = prefs.getBoolean("domanda_4_imm_1", false);
        selezionata_4_imm_1 = prefs.getInt("selezionata_4_imm_1", -1);
        domanda_4_imm_2 = prefs.getBoolean("domanda_4_imm_2", false);
        selezionata_4_imm_2 = prefs.getInt("selezionata_4_imm_2", -1);
        domanda_4_imm_3 = prefs.getBoolean("domanda_4_imm_3", false);
        selezionata_4_imm_3 = prefs.getInt("selezionata_4_imm_3", -1);
        domanda_4_imm_4 = prefs.getBoolean("domanda_4_imm_4", false);
        selezionata_4_imm_4 = prefs.getInt("selezionata_4_imm_4", -1);
        domanda_4_imm_5 = prefs.getBoolean("domanda_4_imm_5", false);
        selezionata_4_imm_5 = prefs.getInt("selezionata_4_imm_5", -1);
        domanda_4_imm_6 = prefs.getBoolean("domanda_4_imm_6", false);
        selezionata_4_imm_6 = prefs.getInt("selezionata_4_imm_6", -1);
        domanda_4_imm_7 = prefs.getBoolean("domanda_4_imm_7", false);
        selezionata_4_imm_7 = prefs.getInt("selezionata_4_imm_7", -1);
        domanda_4_imm_8 = prefs.getBoolean("domanda_4_imm_8", false);
        selezionata_4_imm_8 = prefs.getInt("selezionata_4_imm_8", -1);
        domanda_4_imm_9 = prefs.getBoolean("domanda_4_imm_9", false);
        selezionata_4_imm_9 = prefs.getInt("selezionata_4_imm_9", -1);
        domanda_4_imm_10 = prefs.getBoolean("domanda_4_imm_10", false);
        selezionata_4_imm_10 = prefs.getInt("selezionata_4_imm_10", -1);
        risultato_4_imm = prefs.getBoolean("risultato_4_imm", false);
        contatore_4_imm = prefs.getInt("contatore_4_imm", 0);

        nome=prefs.getString("nome", "");
        casata=prefs.getString("casata", "");


        String[] countryNames={"Scegli","Grifondoro","Serpeverde","Corvonero","Tassorosso"};
        int flags[] = {0,R.drawable.grifo, R.drawable.serpe, R.drawable.corvo, R.drawable.tasso};
        Spinner spinner=findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),flags,countryNames);

        spinner.setAdapter(customAdapter);
        spinner.setSelection(0);

        if(!nome.equals("")){
            Intent i=new Intent(getApplicationContext(),Categorie.class);
            startActivity(i);
            finish();
            return;
        }
    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            builder = new AlertDialog.Builder(this);
        }
        builder.setTitle("Conferma")
                .setMessage("Sei sicuro di voler uscire?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                            finishAffinity();
                        }
                        int pid = Process.myPid();
                        Process.killProcess(pid);
                        MainActivity.super.onBackPressed();

                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void inizia(View view) {
        EditText editText=(EditText) findViewById(R.id.editText);
        nome=editText.getText().toString();
        prefs.edit().putString("nome", nome).apply();
        String[] countryNames={"Scegli","Grifondoro","Serpeverde","Corvonero","Tassorosso"};


        if(nome.trim().equals("")){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Attenzione");
            alertDialog.setMessage("Devi inserire un Nome!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        }
        else {
            Spinner spinner=findViewById(R.id.spinner);
            if(spinner.getSelectedItemPosition()==0){
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Attenzione");
                alertDialog.setMessage("Devi Scegliere una Casata!");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
            else {
                prefs.edit().putString("casata", countryNames[spinner.getSelectedItemPosition()]).apply();
                casata=countryNames[spinner.getSelectedItemPosition()];
                ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
                Intent i = new Intent(getApplicationContext(), Categorie.class);
                startActivity(i,options.toBundle());
                finishAfterTransition();
            }
        }
    }
}
