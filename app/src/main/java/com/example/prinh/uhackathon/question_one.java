package com.example.prinh.uhackathon;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.BoolRes;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DAVID on 3/26/2017.
 */

public class question_one extends Fragment {

    private CheckBox java,php,html,css,android,none;
    private ArrayList<String> lngs;

    public question_one() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View view = inflater.inflate(R.layout.question_one, container, false);

        java = (CheckBox)view.findViewById(R.id.jva);
        php = (CheckBox)view.findViewById(R.id.ph);
        html = (CheckBox)view.findViewById(R.id.htm);
        css = (CheckBox)view.findViewById(R.id.cs);
        android = (CheckBox)view.findViewById(R.id.and);
        none = (CheckBox)view.findViewById(R.id.nne);
        lngs = new ArrayList<>();



        onCheckBocClicked(view);



        return view;


    }

    public boolean isLanguageThere(ArrayList<String> language, String name){
        for (int i=0; i<=language.size(); i++){
            if (language.get(i) == name){
                return true;
            }
        }

        return false;
    }

    public void overWrite(ArrayList<String> languages,String oldVal, String newVal){

    }

    public void onCheckBocClicked(View v){
        boolean checked = ((CheckBox)v).isChecked();

        switch (v.getId()){

            case R.id.jva:
                if (isLanguageThere(lngs,"java")){

                }
                break;
            case R.id.ph:
                lngs.add("php");
                break;
            case R.id.cs:
                lngs.add("css");
                break;
            case R.id.and:
                lngs.add("android");
                break;
            case R.id.nne:
                lngs.add("none");
                break;
            case R.id.htm:
                lngs.add("html");
                break;

        }

    }




}

