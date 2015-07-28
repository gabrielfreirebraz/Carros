package com.example.carros.activity;

import android.support.v7.widget.Toolbar;
import com.example.carros.R;


/**
 * Classe base para todas as activities - 27/07/2015.
 */
public class BaseActivity extends livroandroid.lib.activity.BaseActivity {


    // Ativar a Toolbar como ActionBar
    protected void setUpToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }

    }


}
