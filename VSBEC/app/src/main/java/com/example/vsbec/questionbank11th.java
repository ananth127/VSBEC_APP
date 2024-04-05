package com.example.vsbec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class questionbank11th extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionbank11th);

        Button tamil=findViewById(R.id.button55);
        Button english=findViewById(R.id.button59);
        Button maths=findViewById(R.id.button56);
        Button computerscience=findViewById(R.id.button62);
        Button physics=findViewById(R.id.button60);
        Button chemistry=findViewById(R.id.button57);
        Button botany=findViewById(R.id.button61);
        Button zoology=findViewById(R.id.button88);
        Button home12th=findViewById(R.id.button52);


        tamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank11th.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1wJgKv7_qOxomS3I7O7t3vIVWbpLQ6hF7/view");
                startActivity(intent);
                finish();






            }
        });
        /*

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank11th.this, webview.class);
                intent.putExtra("url","");
                startActivity(intent);
                finish();

            }
        });

        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank11th.this, webview.class);
                intent.putExtra("url","");
                startActivity(intent);
                finish();

            }
        });

        computerscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank11th.this, webview.class);
                intent.putExtra("url","");
                startActivity(intent);
                finish();

            }
        });

        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank11th.this, webview.class);
                intent.putExtra("url","");
                startActivity(intent);
                finish();

            }
        });

        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank11th.this, webview.class);
                intent.putExtra("url","");
                startActivity(intent);
                finish();

            }
        });

        botany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank11th.this, webview.class);
                intent.putExtra("url","");
                startActivity(intent);
                finish();

            }
        });

        zoology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank11th.this, webview.class);
                intent.putExtra("url","");
                startActivity(intent);
                finish();

            }
        });
        
        
         */

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank11th.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1-P582zxxQEy7shTZjFR9Y169bmmX4OAQ/view");
                startActivity(intent);
                finish();

            }
        });

        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank11th.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1hyykcCiXYV4kcU6LlfyrkRecPScGCuO5/view");
                startActivity(intent);
                finish();

            }
        });

        computerscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank11th.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1Z4qqoxgwdnaAlno38rSE2T7Bq9X2YFog/view");
                startActivity(intent);
                finish();

            }
        });

        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank11th.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/19OIdqFW8CyFoy_rFTE0Fu6toqTpGnrMY/view");
                startActivity(intent);
                finish();

            }
        });

        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank11th.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1VpwsavBC7O-LHrNLpNx1DjlkEie5MyQB/vieSw");
                startActivity(intent);
                finish();

            }
        });

        botany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank11th.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1KA7J0nufwJQ_TB5a53s_PgJs-D8k0FLR/view");
                startActivity(intent);
                finish();

            }
        });

        zoology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank11th.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/18SWZsELxsTgjSbZAUBvuhhesYmcbSWz1/view");
                startActivity(intent);
                finish();

            }
        });
        home12th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank11th.this, chooseclassmodel.class);
                startActivity(intent);
                finish();

            }
        });

    }
}