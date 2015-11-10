package com.myweek.apps_menu;


import android.os.Bundle;
import android.widget.ListView;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

/**
 * Created by dwi prakoso on 16/10/2015.
 */
public class FloatingContextDemo extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floating_demo_layout);
        ListView lv = (ListView) findViewById(R.id.list_item);
        registerForContextMenu(lv);


    }
}