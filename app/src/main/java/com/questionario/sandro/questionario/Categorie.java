package com.questionario.sandro.questionario;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.questionario.sandro.questionario.MainActivity.casata;
import static com.questionario.sandro.questionario.MainActivity.domanda_1;
import static com.questionario.sandro.questionario.MainActivity.domanda_10;
import static com.questionario.sandro.questionario.MainActivity.domanda_2;
import static com.questionario.sandro.questionario.MainActivity.domanda_3;
import static com.questionario.sandro.questionario.MainActivity.domanda_4;
import static com.questionario.sandro.questionario.MainActivity.domanda_5;
import static com.questionario.sandro.questionario.MainActivity.domanda_6;
import static com.questionario.sandro.questionario.MainActivity.domanda_7;
import static com.questionario.sandro.questionario.MainActivity.domanda_8;
import static com.questionario.sandro.questionario.MainActivity.domanda_9;
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

public class Categorie extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Scegli la Categoria");
        setContentView(R.layout.categorie);

        TextView textView= findViewById(R.id.nome_categorie);
        textView.setText(nome);

        TextView textView2= findViewById(R.id.casata_categorie);
        textView2.setText(casata);
        if (risultato==true){ImageView imageView=findViewById(R.id.imageView11);imageView.setVisibility(View.VISIBLE);}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.reset:
                AlertDialog.Builder builder;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
                } else {
                    builder = new AlertDialog.Builder(this);
                }
                builder.setTitle("Conferma")
                        .setMessage("Sei sicuro di voler perdere tutti i progressi?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                                startActivity(i);
                                prefs.edit().clear().commit();
                                finishAffinity();

                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                            return;
                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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
                        Categorie.super.onBackPressed();

                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void apri_cat_1(View view) {
        Intent i=new Intent(getApplicationContext(),Pagina_Domande.class);
        startActivity(i);
        finish();
    }
}
