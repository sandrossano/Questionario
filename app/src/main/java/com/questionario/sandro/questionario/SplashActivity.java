package com.questionario.sandro.questionario;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.Process;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.File;
import java.text.DecimalFormat;

public class SplashActivity extends AppCompatActivity {
    int pronto=0;
    ProgressBar progressBar;
    static Context mContent;


    @SuppressLint({"ResourceAsColor", "NewApi"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);



        progressBar = (ProgressBar) findViewById(R.id.progressBar4);
        DrawableCompat.setTint(progressBar.getIndeterminateDrawable(), Color.rgb(255,153,0));

        Window window = getWindow();


        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(pronto==0) {
                    //continua.setVisibility(View.VISIBLE);

                    progressBar.setVisibility(View.GONE);
                    ImageView scopa=findViewById(R.id.scopa_avanti);
                    scopa.setVisibility(View.VISIBLE);
                    scopa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent refresh = new Intent(getApplicationContext(), MainActivity.class);
                            //refresh.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            startActivity(refresh);
                            finish();
                            overridePendingTransition(R.anim.fadein,R.anim.fadeout);
                        }
                    });



                }

            }
        },2500);
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
                        SplashActivity.super.onBackPressed();

                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.runFinalization();
        Runtime.getRuntime().gc();
        System.gc();
    }

}
