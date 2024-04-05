package com.example.vsbec;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class choosebranch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosebranch);
    }

    public void computersciencematerials(View view) {

        Intent intent=new Intent(choosebranch.this, biomaths.class);
        startActivity(intent);
    }

    public void home12(View view) {

        Intent intent=new Intent(choosebranch.this, MainActivity.class);
        startActivity(intent);
    }

    public void biomaths(View view) {
        Intent intent=new Intent(choosebranch.this, bookmaterials.class);
        startActivity(intent);
    }

    public void model11th(View view) {

        Intent intent=new Intent(choosebranch.this, questionbank11th.class);
        startActivity(intent);
    }
    public void model12th(View view) {

        Intent intent=new Intent(choosebranch.this, questionbank12th.class);
        startActivity(intent);
    }
}