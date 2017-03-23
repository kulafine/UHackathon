package com.example.prinh.uhackathon;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Classes extends Fragment {

    private Spinner classes;

    public Classes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_classes, container, false);

        classes = (Spinner)view.findViewById(R.id.spinnerClass);

        ArrayList<String> cls = new ArrayList<>();
        cls.add("Year1");
        cls.add("Year2");
        cls.add("Year3");
        
        CSpinnerAdapter spinnerAdapter = new CSpinnerAdapter(getContext(), cls);
        classes.setAdapter(spinnerAdapter);
        
        classes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), item, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return view;
    }

    public class CSpinnerAdapter extends BaseAdapter implements android.widget.SpinnerAdapter{

        private Context activity;
        private ArrayList<String> list;

        public CSpinnerAdapter(Context ctx, ArrayList<String> list) {
            activity = ctx;
            this.list = list;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return (long)position;
        }

        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            TextView txt = new TextView(getContext());
            txt.setGravity(Gravity.CENTER);
            txt.setPadding(16,16,16,16);
            txt.setTextSize(16);
            txt.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.down_arrow,0);
            txt.setText(list.get(position));
            txt.setTextColor(Color.parseColor("#20d2bb"));
            return txt;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView txt = new TextView(parent.getContext());
            txt.setGravity(Gravity.CENTER);
            txt.setPadding(16,16,16,16);
            txt.setTextSize(16);
            txt.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.down_arrow,0);
            txt.setText(list.get(position));
            txt.setTextColor(Color.parseColor("#20d2bb"));
            return txt;
        }
    }

}
