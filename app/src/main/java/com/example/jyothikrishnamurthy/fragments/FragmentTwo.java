package com.example.jyothikrishnamurthy.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentTwo extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       return inflater.inflate(R.layout.fragment_two, container, false);
    }

    public void setTitle(String text)
    {
        TextView resultText=(TextView) getView().findViewById(R.id.resDisplay);
        resultText.setText(text);

    }

}
