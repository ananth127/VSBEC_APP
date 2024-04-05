package com.example.vsbec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class questionbank12th extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionbank12th);


        Button tamil=findViewById(R.id.button55);
        Button english=findViewById(R.id.button59);
        Button maths=findViewById(R.id.button56);
        Button computerscience=findViewById(R.id.button62);
        Button physics=findViewById(R.id.button60);
        Button chemistry=findViewById(R.id.button57);
        Button botany=findViewById(R.id.button61);
        Button zoology=findViewById(R.id.button58);
        Button home12th=findViewById(R.id.button52);

        tamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank12th.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1yLVS4TrhbY10rXmf70h7Ni8er8VG33Cf/view?usp=drivesdk");
                startActivity(intent);
                finish();


            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank12th.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1XyTxoB8R_I55WvbUiyz3111-gmK5QT45/view?usp=sharing");
                startActivity(intent);
                finish();

            }
        });

        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank12th.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/10V8c1T2-Sse95sOhqN_sjVziDPqcXyO4/view?usp=sharing");
                startActivity(intent);
                finish();

            }
        });

        computerscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank12th.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1rNg5GV9AGd3VnRUsVnOvGD-8Rz60y9wE/view?usp=sharing");
                startActivity(intent);
                finish();

            }
        });

        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank12th.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1ziQMJYR3ec9JVR6YFFqxr0Rpb_X3DgHa/view?usp=sharing");
                startActivity(intent);
                finish();

            }
        });

        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank12th.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1ItyCxLpwbkcAK1h30c5N_17BXAJnf_IL/view?usp=sharing");
                startActivity(intent);
                finish();

            }
        });

        botany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank12th.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/15EBG3aPcLBj7gCGbMU2gH1GUgKnG6o4g/view?usp=sharing");
                startActivity(intent);
                finish();

            }
        });

        zoology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank12th.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1f7U7txrX3O3qlBtFYPhKsd6RnDdv_X-2/view?usp=sharing");
                startActivity(intent);
                finish();

            }
        });
        home12th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(questionbank12th.this, chooseclassmodel.class);
                startActivity(intent);
                finish();

            }
        });

    }
}