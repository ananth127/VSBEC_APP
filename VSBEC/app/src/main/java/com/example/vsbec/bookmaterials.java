package com.example.vsbec;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class bookmaterials extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmaterials);
        Button home=findViewById(R.id.button39);

        Button tamil=findViewById(R.id.button45);
        Button english=findViewById(R.id.button36);
        Button maths1=findViewById(R.id.button31);
        Button maths2=findViewById(R.id.button10);
        Button chem1=findViewById(R.id.button32);
        Button chem2=findViewById(R.id.button35);
        Button phy1=findViewById(R.id.button37);
        Button phy2=findViewById(R.id.button39);
        Button botany=findViewById(R.id.button43);

        Button computer=findViewById(R.id.button88);
        Button zoology=findViewById(R.id.button89);


        tamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(bookmaterials.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1yeuT9Ks6r49DHlk_78A635VdUWltudhq/view");
                startActivity(intent);

            }
        });
        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(bookmaterials.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/197BwYmdhFnUdTc9jpRkro3bx5wwxhwNj/view");
                startActivity(intent);

            }
        });
        zoology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(bookmaterials.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1G_KsTHwZKuJtbnQ1dMzJ9Ft9Qlnro-3H/view");
                startActivity(intent);

            }
        });
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(bookmaterials.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1_NwebA8JpgdkaMnyZwLa2eOFHBMfQYlZ/view");
                startActivity(intent);

            }
        });
        maths1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(bookmaterials.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1_ZbVVsKbh00Gsot51NBC7o7itH3ueBqM/view");
                startActivity(intent);

            }
        });
        maths2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(bookmaterials.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/10Ws7nZhGFWgD718MtSGROc5ySY1qjpox/view");
                startActivity(intent);

            }
        });
        chem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(bookmaterials.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1fDN-_g63WBQqHkQ_cQjpTVpaGJ8h6mu1/view");
                startActivity(intent);

            }
        });
        chem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(bookmaterials.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/16xxmlRH8fNLyWahmFOMcMuyIwKRe3CUr/view");
                startActivity(intent);

            }
        });
        phy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(bookmaterials.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1h0P8Zz8eAz62T0sq_fzS7y-XArUOatxH/view");
                startActivity(intent);

            }
        });
        phy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(bookmaterials.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1YI8G-4icGF6hWIT_FbycwH27xCzFSCia/view");
                startActivity(intent);

            }
        });
        botany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(bookmaterials.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1aGx0v7IoI8qe2lUhpP55yul624O9egHm/view");
                startActivity(intent);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(bookmaterials.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }

}