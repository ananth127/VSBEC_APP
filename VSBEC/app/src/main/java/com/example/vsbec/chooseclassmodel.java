package com.example.vsbec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chooseclassmodel extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseclassmodel);


    Button model11=findViewById(R.id.button45);

    Button model12=findViewById(R.id.button46);

    model11.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent=new Intent(chooseclassmodel.this, questionbank11th.class);
            startActivity(intent);
            finish();

        }
    });
    model12.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent=new Intent(chooseclassmodel.this, questionbank12th.class);
            startActivity(intent);
            finish();

        }
    });



    }
}