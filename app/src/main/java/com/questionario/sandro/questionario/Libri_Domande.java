package com.questionario.sandro.questionario;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.transition.Explode;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import static com.questionario.sandro.questionario.MainActivity.casata;
import static com.questionario.sandro.questionario.MainActivity.nome;
import static com.questionario.sandro.questionario.MainActivity.prefs;
import static com.questionario.sandro.questionario.MainActivity.risultato;

/**
 * Created by sandro on 02/07/18.
 */

public class Libri_Domande extends AppCompatActivity{
    PopupWindow popupWindow;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onCreate( Bundle savedInstanceState) {


        Explode entertransition= new Explode();
        entertransition.setDuration(500);
        getWindow().setEnterTransition(entertransition);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.libri_domande);

        DisplayMetrics displayMetrics = getApplicationContext().getResources().getDisplayMetrics();
        int dpi = (displayMetrics.densityDpi);
        int height=(displayMetrics.heightPixels-(90*dpi/160))/3;
        int width=(displayMetrics.widthPixels-(60*dpi/160))/3;

        Button pietra=findViewById(R.id.button16);
        Button vuoto1=findViewById(R.id.button17);
        Button camera_segreti=findViewById(R.id.button18);
        Button azkabam=findViewById(R.id.button19);
        Button doni_morte=findViewById(R.id.button20);
        Button calice_fuoco=findViewById(R.id.button21);
        Button ordine_fenice=findViewById(R.id.button33);
        Button principe_mezzosangue=findViewById(R.id.button34);
        Button vuoto2=findViewById(R.id.button35);

        pietra.getLayoutParams().height=height;
        pietra.getLayoutParams().width=width;
        vuoto1.getLayoutParams().height=height;
        vuoto1.getLayoutParams().width=width;
        camera_segreti.getLayoutParams().height=height;
        camera_segreti.getLayoutParams().width=width;
        azkabam.getLayoutParams().height=height;
        azkabam.getLayoutParams().width=width;
        doni_morte.getLayoutParams().height=height;
        doni_morte.getLayoutParams().width=width;
        calice_fuoco.getLayoutParams().height=height;
        calice_fuoco.getLayoutParams().width=width;
        ordine_fenice.getLayoutParams().height=height;
        ordine_fenice.getLayoutParams().width=width;
        principe_mezzosangue.getLayoutParams().height=height;
        principe_mezzosangue.getLayoutParams().width=width;
        vuoto2.getLayoutParams().height=height;
        vuoto2.getLayoutParams().width=width;

        System.gc();

    }
    private int getScale(){
        Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        int width = display.getWidth();

        Double val = new Double(width)/720;
        val = val * 100d;
        return val.intValue();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_mezzosangue(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_Domande.class);
        startActivity(i,options.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_pietra(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_Domande.class);
        startActivity(i,options.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_calice(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_Domande.class);
        startActivity(i,options.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_doni(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_Domande.class);
        startActivity(i,options.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_fenice(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_Domande.class);
        startActivity(i,options.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_azkabam(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_Domande.class);
        startActivity(i,options.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void apri_camera(View view) {
        ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i=new Intent(getApplicationContext(),Pagina_Domande.class);
        startActivity(i,options.toBundle());
    }
}
