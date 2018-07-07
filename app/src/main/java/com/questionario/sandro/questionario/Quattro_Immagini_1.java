package com.questionario.sandro.questionario;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import static com.questionario.sandro.questionario.MainActivity.domanda_4_imm_1;
import static com.questionario.sandro.questionario.MainActivity.domanda_imm_1;
import static com.questionario.sandro.questionario.MainActivity.prefs;
import static com.questionario.sandro.questionario.MainActivity.selezionata_4_imm_1;
import static com.questionario.sandro.questionario.MainActivity.selezionata_imm_1;


/**
 * Created by sandro on 02/07/18.
 */

public class Quattro_Immagini_1 extends AppCompatActivity {
    SharedPreferences.Editor editor = prefs.edit();

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Explode entertransition= new Explode();
        entertransition.setDuration(500);
        getWindow().setEnterTransition(entertransition);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_4imm_1);

        DisplayMetrics displayMetrics = getApplicationContext().getResources().getDisplayMetrics();
        int width = (displayMetrics.widthPixels)/6;
        int height = (displayMetrics.heightPixels)/10;

        RelativeLayout bottoni=findViewById(R.id.bottoni);
        RelativeLayout.LayoutParams parameter =  (RelativeLayout.LayoutParams) bottoni.getLayoutParams();
        parameter.setMargins(0, 0, 0, 0); // left, top, right, bottom
        //bottoni.setPadding(15,0,15,0);
        bottoni.setLayoutParams(parameter);
        bottoni.getLayoutParams().height=height*3;
        bottoni.setBackgroundResource(R.drawable.legno);

        Button b1=findViewById(R.id.a);
        b1.getLayoutParams().width=width;
        b1.getLayoutParams().height=height;
        Button b2=findViewById(R.id.b);
        b2.getLayoutParams().width=width;
        b2.getLayoutParams().height=height;
        Button b3=findViewById(R.id.c);
        b3.getLayoutParams().width=width;
        b3.getLayoutParams().height=height;
        Button b4=findViewById(R.id.d);
        b4.getLayoutParams().width=width;
        b4.getLayoutParams().height=height;
        Button b5=findViewById(R.id.e);
        b5.getLayoutParams().width=width;
        b5.getLayoutParams().height=height;
        Button b6=findViewById(R.id.f);
        b6.getLayoutParams().width=width;
        b6.getLayoutParams().height=height;
        Button b7=findViewById(R.id.g);
        b7.getLayoutParams().width=width;
        b7.getLayoutParams().height=height;
        Button b8=findViewById(R.id.h);
        b8.getLayoutParams().width=width;
        b8.getLayoutParams().height=height;
        Button b9=findViewById(R.id.i);
        b9.getLayoutParams().width=width;
        b9.getLayoutParams().height=height;
        Button b10=findViewById(R.id.l);
        b10.getLayoutParams().width=width;
        b10.getLayoutParams().height=height;
        Button b11=findViewById(R.id.m);
        b11.getLayoutParams().width=width;
        b11.getLayoutParams().height=height;
        Button b12=findViewById(R.id.n);
        b12.getLayoutParams().width=width;
        b12.getLayoutParams().height=height;
        Button b13=findViewById(R.id.o);
        b13.getLayoutParams().width=width;
        b13.getLayoutParams().height=height;
        Button b14=findViewById(R.id.p);
        b14.getLayoutParams().width=width;
        b14.getLayoutParams().height=height;
        Button b15=findViewById(R.id.q);
        b15.getLayoutParams().width=width;
        b15.getLayoutParams().height=height;
        Button b16=findViewById(R.id.r);
        b16.getLayoutParams().width=width;
        b16.getLayoutParams().height=height;


        int dpi = (displayMetrics.densityDpi);
        ImageView imm1=findViewById(R.id.immagine1);
        ImageView imm2=findViewById(R.id.immagine2);
        ImageView imm3=findViewById(R.id.immagine3);
        ImageView imm4=findViewById(R.id.immagine4);

        RelativeLayout relativeLayout=findViewById(R.id.risposta);
        RelativeLayout relativeLayout2=findViewById(R.id.bottoni);
        RelativeLayout relativeLayout3=findViewById(R.id.riga1);
        RelativeLayout relativeLayout4=findViewById(R.id.riga2);

        int a=relativeLayout.getLayoutParams().height;
        int b=relativeLayout2.getLayoutParams().height;

        int width_imm=displayMetrics.widthPixels-((60*dpi)/160);
        int height_imm = displayMetrics.heightPixels-a-b-((125*dpi)/160);
        relativeLayout3.getLayoutParams().height=height_imm/2;
        relativeLayout4.getLayoutParams().height=height_imm/2;

        imm1.getLayoutParams().height=height_imm/2;
        imm2.getLayoutParams().height=height_imm/2;
        imm3.getLayoutParams().height=height_imm/2;
        imm4.getLayoutParams().height=height_imm/2;
        imm1.getLayoutParams().width=width_imm/2;
        imm2.getLayoutParams().width=width_imm/2;
        imm3.getLayoutParams().width=width_imm/2;
        imm4.getLayoutParams().width=width_imm/2;


        domanda_4_imm_1=true;
        editor.putBoolean("domanda_imm_1",domanda_4_imm_1);
        editor.apply();

        if (selezionata_4_imm_1==1){
            Button b22=findViewById(R.id.button22);
            b22.setText("S");
            b22.setClickable(false);
            Button b23=findViewById(R.id.button23);
            b23.setText("I");b23.setClickable(false);
            Button b24=findViewById(R.id.button24);
            b24.setText("R");b24.setClickable(false);
            Button b25=findViewById(R.id.button25);
            b25.setText("I");b25.setClickable(false);
            Button b26=findViewById(R.id.button26);
            b26.setText("U");b26.setClickable(false);
            Button b27=findViewById(R.id.button27);
            b27.setText("S");b27.setClickable(false);
            Button b28=findViewById(R.id.button28);
            b28.setText("B");b28.setClickable(false);
            Button b29=findViewById(R.id.button29);
            b29.setText("L");b29.setClickable(false);


            findViewById(R.id.avanti).setVisibility(View.INVISIBLE);
        }
    }

    public void inserisci_lettera(View view) {
        Button premuto=(Button)view;
        Button b22=findViewById(R.id.button22);
        Button b23=findViewById(R.id.button23);
        Button b24=findViewById(R.id.button24);
        Button b25=findViewById(R.id.button25);
        Button b26=findViewById(R.id.button26);
        Button b27=findViewById(R.id.button27);
        Button b28=findViewById(R.id.button28);

        if(b22.getText().equals("")){
            b22.setText(premuto.getText());
            premuto.setVisibility(View.INVISIBLE);
        }
        else{
            if(b23.getText().equals("")){
                b23.setText(premuto.getText());
                premuto.setVisibility(View.INVISIBLE);
            }
            else{
                if(b24.getText().equals("")){
                    b24.setText(premuto.getText());
                    premuto.setVisibility(View.INVISIBLE);
                }
                else{
                    if(b25.getText().equals("")){
                        b25.setText(premuto.getText());
                        premuto.setVisibility(View.INVISIBLE);
                    }
                    else{
                        if(b26.getText().equals("")){
                            b26.setText(premuto.getText());
                            premuto.setVisibility(View.INVISIBLE);
                        }
                        else{
                            if(b27.getText().equals("")){
                                b27.setText(premuto.getText());
                                premuto.setVisibility(View.INVISIBLE);
                            }
                            else{
                                if(b28.getText().equals("")){
                                    b28.setText(premuto.getText());
                                    premuto.setVisibility(View.INVISIBLE);
                                }
                                else{

                                }
                            }
                        }
                    }
                }

            }
        }
    }

    public void pulisci(View view) {
        Button premuto=(Button)view;


        Button b1=findViewById(R.id.a);
        Button b2=findViewById(R.id.b);
        Button b3=findViewById(R.id.c);
        Button b4=findViewById(R.id.d);
        Button b5=findViewById(R.id.e);
        Button b6=findViewById(R.id.f);
        Button b7=findViewById(R.id.g);
        Button b8=findViewById(R.id.h);
        Button b9=findViewById(R.id.i);
        Button b10=findViewById(R.id.l);
        Button b11=findViewById(R.id.m);
        Button b12=findViewById(R.id.n);
        Button b13=findViewById(R.id.o);
        Button b14=findViewById(R.id.p);
        Button b15=findViewById(R.id.q);
        Button b16=findViewById(R.id.r);
        if(premuto.getText().equals(b1.getText())){b1.setVisibility(View.VISIBLE);}
        if(premuto.getText().equals(b2.getText())){b2.setVisibility(View.VISIBLE);}
        if(premuto.getText().equals(b3.getText())){b3.setVisibility(View.VISIBLE);}
        if(premuto.getText().equals(b4.getText())){b4.setVisibility(View.VISIBLE);}
        if(premuto.getText().equals(b5.getText())){b5.setVisibility(View.VISIBLE);}
        if(premuto.getText().equals(b6.getText())){b6.setVisibility(View.VISIBLE);}
        if(premuto.getText().equals(b7.getText())){b7.setVisibility(View.VISIBLE);}
        if(premuto.getText().equals(b8.getText())){b8.setVisibility(View.VISIBLE);}
        if(premuto.getText().equals(b9.getText())){b9.setVisibility(View.VISIBLE);}
        if(premuto.getText().equals(b10.getText())){b10.setVisibility(View.VISIBLE);}
        if(premuto.getText().equals(b11.getText())){b11.setVisibility(View.VISIBLE);}
        if(premuto.getText().equals(b12.getText())){b12.setVisibility(View.VISIBLE);}
        if(premuto.getText().equals(b13.getText())){b13.setVisibility(View.VISIBLE);}
        if(premuto.getText().equals(b14.getText())){b14.setVisibility(View.VISIBLE);}
        if(premuto.getText().equals(b15.getText())){b15.setVisibility(View.VISIBLE);}
        if(premuto.getText().equals(b16.getText())){b16.setVisibility(View.VISIBLE);}

        premuto.setText("");
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBackPressed() {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_Quattro_Immagini.class);
        startActivity(i,options.toBundle());
        finishAfterTransition();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void fatto_imm(View view) {
        Button b22=findViewById(R.id.button22);
        Button b23=findViewById(R.id.button23);
        Button b24=findViewById(R.id.button24);
        Button b25=findViewById(R.id.button25);
        Button b26=findViewById(R.id.button26);
        Button b27=findViewById(R.id.button27);
        Button b28=findViewById(R.id.button28);

        if(b22.getText().equals("S")&&b23.getText().equals("I")&&b24.getText().equals("R")&&b25.getText().equals("I")&&
                b26.getText().equals("U")&&b27.getText().equals("S")&&b28.getText().equals("B")
                ) {

            selezionata_4_imm_1=1;
            editor.putInt("selezionata_4_imm_1", selezionata_4_imm_1);
            editor.putBoolean("domanda_4_imm_2",true);
            editor.apply();

            Intent i = new Intent(getApplicationContext(), Quattro_Immagini_1.class);
            startActivity(i);
            overridePendingTransition(R.anim.fadein,R.anim.fadeout);
            finishAfterTransition();
        }
    }
}
