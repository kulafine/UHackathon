package com.example.prinh.uhackathon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

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

    public boolean languageIsFound(ArrayList<String> language, String name){
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
                if (languageIsFound(lngs,"java")){

                }
                break;
            case R.id.ph:
                if (languageIsFound(lngs,"php")){

                }
                break;
            case R.id.cs:
                if (languageIsFound(lngs,"css")){

                }
                break;
            case R.id.and:
                if (languageIsFound(lngs,"android")){

                }
                break;
            case R.id.nne:
                if (languageIsFound(lngs,"none")){

                }
                break;
            case R.id.htm:
                if (languageIsFound(lngs,"html")){

                }
                break;

        }

    }




}

