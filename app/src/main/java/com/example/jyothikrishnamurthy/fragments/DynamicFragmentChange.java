package com.example.jyothikrishnamurthy.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DynamicFragmentChange extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragment_change);

    }

    public void changeFrag(View view){
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        SecondFragment fragment = new SecondFragment();
        transaction.replace(R.id.fragment3, fragment);
        transaction.addToBackStack(null).commit();
    }

    @Override
    public void onBackPressed() {
       // super.onBackPressed();
        FragmentManager fragmanager = getFragmentManager();
        while(fragmanager.getBackStackEntryCount()!=0){
            fragmanager.popBackStackImmediate();
        }
    }


}
