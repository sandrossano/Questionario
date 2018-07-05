package com.questionario.sandro.questionario;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.transition.Explode;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Spinner;
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

public class Categorie extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    PopupWindow popupWindow;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Scegli la Categoria");
        setContentView(R.layout.categorie);

        TextView textView= findViewById(R.id.nome_categorie);
        textView.setText(nome);

        DisplayMetrics displayMetrics = getApplicationContext().getResources().getDisplayMetrics();
        int dpi = (displayMetrics.densityDpi);

        RelativeLayout relativeLayout=findViewById(R.id.nome);
        RelativeLayout relativeLayout2=findViewById(R.id.casata);
        int a=relativeLayout.getLayoutParams().height=(70*dpi)/160;
        int b=relativeLayout2.getLayoutParams().height=(75*dpi)/160;

        int height = displayMetrics.heightPixels-a-b-((73*dpi)/160);
        int singolo= height/4;

        Button categoria=findViewById(R.id.categoria);
        categoria.getLayoutParams().height=singolo;
        Button button13=findViewById(R.id.button13);
        button13.getLayoutParams().height=singolo;
        Button button14=findViewById(R.id.button14);
        button14.getLayoutParams().height=singolo;
        Button button15=findViewById(R.id.button15);
        button15.getLayoutParams().height=singolo;

        TextView textView2= findViewById(R.id.casata_categorie);
        textView2.setText(casata);
        ImageView imageView=findViewById(R.id.logo_casata);
        if (casata.equals("Grifondoro")){imageView.setImageResource(R.drawable.grifo);}
        if (casata.equals("Serpeverde")){imageView.setImageResource(R.drawable.serpe);}
        if (casata.equals("Corvonero")) {imageView.setImageResource(R.drawable.corvo);}
        if (casata.equals("Tassorosso")){imageView.setImageResource(R.drawable.tasso);}

        if (risultato==true){ImageView im=findViewById(R.id.imageView11);im.setVisibility(View.VISIBLE);}

        System.gc();

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
                                prefs.edit().clear().apply();
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

    public void apri_popup(View view) {
        LayoutInflater layoutInflater = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.new_popup_layout, null);
        popupWindow = new PopupWindow(
                layout,
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);

        Spinner spinner=layout.findViewById(R.id.cambia_casata);
        spinner.setOnItemSelectedListener(this);
        String[] countryNames={"Scegli","Grifondoro","Serpeverde","Corvonero","Tassorosso"};
        int flags[] = {0,R.drawable.grifo, R.drawable.serpe, R.drawable.corvo, R.drawable.tasso};

        CustomAdapter customAdapter=new CustomAdapter(Categorie.this,flags,countryNames);

        spinner.setAdapter(customAdapter);
        if (casata.equals("Grifondoro"))spinner.setSelection(1);
        if (casata.equals("Tassorosso"))spinner.setSelection(4);
        if (casata.equals("Corvonero"))spinner.setSelection(3);
        if (casata.equals("Serpeverde"))spinner.setSelection(2);
        Button cambia_casata_button=layout.findViewById(R.id.cambia_casata_button);
        cambia_casata_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prefs.edit().putString("casata", casata).apply();
                AlertDialog alertDialog = new AlertDialog.Builder(Categorie.this).create();
                alertDialog.setTitle("Complimenti");
                alertDialog.setMessage("La tua Nuova Casata è: "+casata+"!");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i=new Intent(Categorie.this,Categorie.class);
                                i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                                startActivity(i);
                                finishAffinity();
                            }
                        });
                alertDialog.show();

            }
        });


        layout.findViewById(R.id.reset_gioco).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    builder = new AlertDialog.Builder(Categorie.this, android.R.style.Theme_Material_Dialog_Alert);
                } else {
                    builder = new AlertDialog.Builder(Categorie.this);
                }
                builder.setTitle("Conferma")
                        .setMessage("Sei sicuro di voler perdere tutti i progressi?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                            public void onClick(DialogInterface dialog, int which) {

                                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                                startActivity(i);
                                prefs.edit().clear().apply();
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
            }
        });

        layout.findViewById(R.id.cambia).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Categorie.this);
                builder.setTitle("Inserisci nuovo Nome:");

// Set up the input
                final EditText input = new EditText(Categorie.this);
// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
                input.setInputType(InputType.TYPE_CLASS_TEXT);
                builder.setView(input);

// Set up the buttons
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                         if(!input.getText().toString().trim().equals("")){
                         nome=input.getText().toString();
                         prefs.edit().putString("nome", nome).apply();
                         Intent i=new Intent(Categorie.this,Categorie.class);
                         i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                         startActivity(i);
                         finishAffinity();
                         }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();
            }
        });

        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
    }

    public void close(View view) {
        popupWindow.dismiss();
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

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void apri_cat_1(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_Domande.class);
        startActivity(i,options.toBundle());

    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void apri_imm(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_Immagini.class);
        startActivity(i,options.toBundle());
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

     @TargetApi(Build.VERSION_CODES.LOLLIPOP)
     @Override
    protected void onResume() {
        Explode entertransition= new Explode();
        entertransition.setDuration(500);
        getWindow().setEnterTransition(entertransition);

        super.onResume();
    }
}
