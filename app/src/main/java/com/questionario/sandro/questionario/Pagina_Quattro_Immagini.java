package com.questionario.sandro.questionario;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import static com.questionario.sandro.questionario.MainActivity.domanda_4_imm_1;
import static com.questionario.sandro.questionario.MainActivity.domanda_4_imm_10;
import static com.questionario.sandro.questionario.MainActivity.domanda_4_imm_2;
import static com.questionario.sandro.questionario.MainActivity.domanda_4_imm_3;
import static com.questionario.sandro.questionario.MainActivity.domanda_4_imm_4;
import static com.questionario.sandro.questionario.MainActivity.domanda_4_imm_5;
import static com.questionario.sandro.questionario.MainActivity.domanda_4_imm_6;
import static com.questionario.sandro.questionario.MainActivity.domanda_4_imm_7;
import static com.questionario.sandro.questionario.MainActivity.domanda_4_imm_8;
import static com.questionario.sandro.questionario.MainActivity.domanda_4_imm_9;
import static com.questionario.sandro.questionario.MainActivity.domanda_imm_1;
import static com.questionario.sandro.questionario.MainActivity.domanda_imm_10;
import static com.questionario.sandro.questionario.MainActivity.domanda_imm_2;
import static com.questionario.sandro.questionario.MainActivity.domanda_imm_3;
import static com.questionario.sandro.questionario.MainActivity.domanda_imm_4;
import static com.questionario.sandro.questionario.MainActivity.domanda_imm_5;
import static com.questionario.sandro.questionario.MainActivity.domanda_imm_6;
import static com.questionario.sandro.questionario.MainActivity.domanda_imm_7;
import static com.questionario.sandro.questionario.MainActivity.domanda_imm_8;
import static com.questionario.sandro.questionario.MainActivity.domanda_imm_9;
import static com.questionario.sandro.questionario.MainActivity.prefs;
import static com.questionario.sandro.questionario.MainActivity.risultato_4_imm;
import static com.questionario.sandro.questionario.MainActivity.risultato_imm;
import static com.questionario.sandro.questionario.MainActivity.selezionata_4_imm_1;
import static com.questionario.sandro.questionario.MainActivity.selezionata_4_imm_10;
import static com.questionario.sandro.questionario.MainActivity.selezionata_4_imm_2;
import static com.questionario.sandro.questionario.MainActivity.selezionata_4_imm_3;
import static com.questionario.sandro.questionario.MainActivity.selezionata_4_imm_4;
import static com.questionario.sandro.questionario.MainActivity.selezionata_4_imm_5;
import static com.questionario.sandro.questionario.MainActivity.selezionata_4_imm_6;
import static com.questionario.sandro.questionario.MainActivity.selezionata_4_imm_7;
import static com.questionario.sandro.questionario.MainActivity.selezionata_4_imm_8;
import static com.questionario.sandro.questionario.MainActivity.selezionata_4_imm_9;
import static com.questionario.sandro.questionario.MainActivity.selezionata_imm_1;
import static com.questionario.sandro.questionario.MainActivity.selezionata_imm_10;
import static com.questionario.sandro.questionario.MainActivity.selezionata_imm_2;
import static com.questionario.sandro.questionario.MainActivity.selezionata_imm_3;
import static com.questionario.sandro.questionario.MainActivity.selezionata_imm_4;
import static com.questionario.sandro.questionario.MainActivity.selezionata_imm_5;
import static com.questionario.sandro.questionario.MainActivity.selezionata_imm_6;
import static com.questionario.sandro.questionario.MainActivity.selezionata_imm_7;
import static com.questionario.sandro.questionario.MainActivity.selezionata_imm_8;
import static com.questionario.sandro.questionario.MainActivity.selezionata_imm_9;

/**
 * Created by sandro on 02/07/18.
 */

public class Pagina_Quattro_Immagini extends AppCompatActivity {
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onCreate( Bundle savedInstanceState) {
        Explode entertransition= new Explode();
        entertransition.setDuration(500);
        getWindow().setEnterTransition(entertransition);

        super.onCreate(savedInstanceState);
        setTitle("Categoria");
        setContentView(R.layout.pagina_4_imm);

        if(domanda_4_imm_1==true){findViewById(R.id.domanda_1).setEnabled(true);}
        if(selezionata_4_imm_1!=-1){ImageView imageView=findViewById(R.id.imageView);
            imageView.setVisibility(View.VISIBLE);}
        if(risultato_imm){ImageView imageView=findViewById(R.id.imageView);
            if(selezionata_4_imm_1==2)imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_check_circle_black_24dp));
            else{imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_indeterminate_check_box_black_24dp));}
        }

        if(domanda_4_imm_2==true){findViewById(R.id.domanda_2).setEnabled(true);}
        else{if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                findViewById(R.id.domanda_2).setForeground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
            }
            else{
                findViewById(R.id.domanda_2).setBackground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
            }
            findViewById(R.id.domanda_2).setEnabled(false);
            findViewById(R.id.button4).setEnabled(false);
        }
        if(selezionata_4_imm_2!=-1){ImageView imageView=findViewById(R.id.imageView2);
            imageView.setVisibility(View.VISIBLE);}
        if(risultato_4_imm){ImageView imageView=findViewById(R.id.imageView2);
            if(selezionata_4_imm_2==2)imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_check_circle_black_24dp));
            else{imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_indeterminate_check_box_black_24dp));}
        }


        if(domanda_4_imm_3==true){findViewById(R.id.domanda_3).setEnabled(true);}
        else{if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            findViewById(R.id.domanda_3).setForeground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
        }
        else{
            findViewById(R.id.domanda_3).setBackground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
        }
            findViewById(R.id.domanda_3).setEnabled(false);
            findViewById(R.id.button5).setEnabled(false);
        }
        if(selezionata_4_imm_3!=-1){ImageView imageView=findViewById(R.id.imageView3);
            imageView.setVisibility(View.VISIBLE);}
        if(risultato_4_imm){ImageView imageView=findViewById(R.id.imageView3);
            if(selezionata_4_imm_3==2)imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_check_circle_black_24dp));
            else{imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_indeterminate_check_box_black_24dp));}
        }


        if(domanda_4_imm_4==true){findViewById(R.id.domanda_4).setEnabled(true);}
        else{if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            findViewById(R.id.domanda_4).setForeground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
        }
        else{
            findViewById(R.id.domanda_4).setBackground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
        }
            findViewById(R.id.domanda_4).setEnabled(false);
            findViewById(R.id.button6).setEnabled(false);
        }
        if(selezionata_4_imm_4!=-1){ImageView imageView=findViewById(R.id.imageView4);
            imageView.setVisibility(View.VISIBLE);}
        if(risultato_4_imm){ImageView imageView=findViewById(R.id.imageView4);
            if(selezionata_4_imm_4==2)imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_check_circle_black_24dp));
            else{imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_indeterminate_check_box_black_24dp));}
        }

        if(domanda_4_imm_5==true){findViewById(R.id.domanda_5).setEnabled(true);}
        else{if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            findViewById(R.id.domanda_5).setForeground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
        }
        else{
            findViewById(R.id.domanda_5).setBackground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
        }
            findViewById(R.id.domanda_5).setEnabled(false);
            findViewById(R.id.button7).setEnabled(false);
        }
        if(selezionata_4_imm_5!=-1){ImageView imageView=findViewById(R.id.imageView5);
            imageView.setVisibility(View.VISIBLE);}
        if(risultato_4_imm){ImageView imageView=findViewById(R.id.imageView5);
            if(selezionata_4_imm_5==2)imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_check_circle_black_24dp));
            else{imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_indeterminate_check_box_black_24dp));}
        }


        if(domanda_4_imm_6==true){findViewById(R.id.domanda_6).setEnabled(true);}
        else{if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            findViewById(R.id.domanda_6).setForeground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
        }
        else{
            findViewById(R.id.domanda_6).setBackground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
        }
            findViewById(R.id.domanda_6).setEnabled(false);
            findViewById(R.id.button8).setEnabled(false);
        }
        if(selezionata_4_imm_6!=-1){ImageView imageView=findViewById(R.id.imageView6);
            imageView.setVisibility(View.VISIBLE);}
        if(risultato_4_imm){ImageView imageView=findViewById(R.id.imageView6);
            if(selezionata_4_imm_6==2)imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_check_circle_black_24dp));
            else{imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_indeterminate_check_box_black_24dp));}
        }


        if(domanda_4_imm_7==true){findViewById(R.id.domanda_7).setEnabled(true);}
        else{if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            findViewById(R.id.domanda_7).setForeground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
        }
        else{
            findViewById(R.id.domanda_7).setBackground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
        }
            findViewById(R.id.domanda_7).setEnabled(false);
            findViewById(R.id.button9).setEnabled(false);
        }
        if(selezionata_4_imm_7!=-1){ImageView imageView=findViewById(R.id.imageView7);
            imageView.setVisibility(View.VISIBLE);}
        if(risultato_4_imm){ImageView imageView=findViewById(R.id.imageView7);
            if(selezionata_4_imm_7==2)imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_check_circle_black_24dp));
            else{imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_indeterminate_check_box_black_24dp));}
        }


        if(domanda_4_imm_8==true){findViewById(R.id.domanda_8).setEnabled(true);}
        else{if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            findViewById(R.id.domanda_8).setForeground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
        }
        else{
            findViewById(R.id.domanda_8).setBackground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
        }
            findViewById(R.id.domanda_8).setEnabled(false);
            findViewById(R.id.button10).setEnabled(false);
        }
        if(selezionata_4_imm_8!=-1){ImageView imageView=findViewById(R.id.imageView8);
            imageView.setVisibility(View.VISIBLE);}
        if(risultato_4_imm){ImageView imageView=findViewById(R.id.imageView8);
            if(selezionata_4_imm_8==2)imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_check_circle_black_24dp));
            else{imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_indeterminate_check_box_black_24dp));}
        }


        if(domanda_4_imm_9==true){findViewById(R.id.domanda_9).setEnabled(true);}
        else{if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            findViewById(R.id.domanda_9).setForeground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
        }
        else{
            findViewById(R.id.domanda_9).setBackground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
        }
            findViewById(R.id.domanda_9).setEnabled(false);
            findViewById(R.id.button11).setEnabled(false);
        }
        if(selezionata_4_imm_9!=-1){ImageView imageView=findViewById(R.id.imageView9);
            imageView.setVisibility(View.VISIBLE);}
        if(risultato_4_imm){ImageView imageView=findViewById(R.id.imageView9);
            if(selezionata_4_imm_9==2)imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_check_circle_black_24dp));
            else{imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_indeterminate_check_box_black_24dp));}
        }


        if(domanda_4_imm_10==true){findViewById(R.id.domanda_10).setEnabled(true);}
        else{if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            findViewById(R.id.domanda_10).setForeground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
        }
        else{
            findViewById(R.id.domanda_10).setBackground(new ColorDrawable(ContextCompat.getColor(getApplicationContext(), R.color.colorEnable)));
        }
            findViewById(R.id.domanda_10).setEnabled(false);
            findViewById(R.id.button12).setEnabled(false);
        }
        if(selezionata_4_imm_10!=-1){ImageView imageView=findViewById(R.id.imageView10);
            imageView.setVisibility(View.VISIBLE);}
        if(risultato_4_imm){ImageView imageView=findViewById(R.id.imageView10);
            if(selezionata_4_imm_10==2)imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_check_circle_black_24dp));
            else{imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_indeterminate_check_box_black_24dp));}
        }

        System.gc();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_imm_1(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Quattro_Immagini_1.class);
        startActivity(i,options.toBundle());
        finish();
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_imm_2(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Immagini_2.class);
        startActivity(i,options.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_imm_3(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_3.class);
        startActivity(i,options.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_imm_4(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_4.class);
        startActivity(i,options.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_imm_5(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_5.class);
        startActivity(i,options.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_imm_6(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_6.class);
        startActivity(i);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_imm_7(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_7.class);
        startActivity(i,options.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_imm_8(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_8.class);
        startActivity(i,options.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_imm_9(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_9.class);
        startActivity(i,options.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_imm_10(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_10.class);
        startActivity(i,options.toBundle());
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

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBackPressed() {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Categorie.class);
        startActivity(i,options.toBundle());
        finishAfterTransition();
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.gc();
    }
}
