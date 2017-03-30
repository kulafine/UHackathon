package com.example.prinh.uhackathon;

import android.content.Context;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

/**
 * Created by DAVID on 3/29/2017.
 */

public class ServerPost {

    private DatabaseReference db;

    public void Post(HashMap<Integer, String> data){
        db = FirebaseDatabase.getInstance().getReference();

        for(int i=0; i<=data.size(); i++){
            db.child("Views").child(data.get(4)).push().setValue(data.get(i));
        }

    }


}
