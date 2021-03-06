package com.questionario.sandro.questionario;

/**
 * Created by sandro on 02/07/18.
 */

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static com.questionario.sandro.questionario.MainActivity.prefs;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int flags[];
    String[] countryNames;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, int[] flags, String[] countryNames) {
        this.context = applicationContext;
        this.flags = flags;
        this.countryNames = countryNames;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return flags.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

        @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spinner, null);
        ImageView icon = (ImageView) view.findViewById(R.id.imageView);
        if(i!=0)icon.setVisibility(View.VISIBLE);
        TextView names = (TextView) view.findViewById(R.id.textView);
            if(i!=0)names.setVisibility(View.VISIBLE);
        icon.setImageResource(flags[i]);
        names.setText(countryNames[i]);
            if(i!=0){prefs.edit().putString("casata", countryNames[i]).apply();
                MainActivity.casata=countryNames[i];
                }
        return view;
    }
}
