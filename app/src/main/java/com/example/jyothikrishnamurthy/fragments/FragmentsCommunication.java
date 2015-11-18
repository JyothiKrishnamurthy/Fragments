package com.example.jyothikrishnamurthy.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class FragmentsCommunication extends AppCompatActivity implements FragmentOne.TitleChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments_communication);

    }
    public void onUpdateTitle(String title)
    {
        FragmentTwo frag = (FragmentTwo) getFragmentManager().findFragmentById(R.id.fragmenttwo);
        frag.setTitle(title);
    }


}
