package com.example.vsbec;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class biomaths extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biomaths);
        Button home=findViewById(R.id.button39);

        Button tamil=findViewById(R.id.button45);
        Button english=findViewById(R.id.button36);
        Button maths1=findViewById(R.id.button31);
        Button maths2=findViewById(R.id.button10);
        Button chem1=findViewById(R.id.button32);
        Button chem2=findViewById(R.id.button35);
        Button phy1=findViewById(R.id.button37);
        Button phy2=findViewById(R.id.button39);
        Button botany=findViewById(R.id.button40);
        Button zoology=findViewById(R.id.button34);


        tamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
/*
                Intent intent=new Intent(biomaths.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/10cvdPYOss79GQiHmrOLnCpNf4rKpW3zu/view");
                startActivity(intent);



 */

                String url = "https://drive.google.com/file/d/10cvdPYOss79GQiHmrOLnCpNf4rKpW3zu/view";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));

            }
        });
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(biomaths.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1ouYA8NRuwcaAUnv5tTz47ToW70S2fI0S/view");
                startActivity(intent);

            }
        });
        maths1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(biomaths.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1qCiom524Szt6SSXBiKoFs46_OAaiUhEo/view");
                startActivity(intent);

            }
        });
        maths2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(biomaths.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1VHWA08TnYtXrhf3rt_z6OFsTrL3IJYCO/view");
                startActivity(intent);

            }
        });
        chem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(biomaths.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1R4PL75IdKXezP9ObdCSVc9bWE5eWo584/view");
                startActivity(intent);

            }
        });
        chem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(biomaths.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1bT8FOiqO0im-psETAVBNDi3XS_zk3ueO/view");
                startActivity(intent);

            }
        });
        phy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(biomaths.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/17KF0l3aeS3yD2oBYJ37FEsyn5l8Twklz/view");
                startActivity(intent);

            }
        });
        phy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(biomaths.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1vxTdRkPDF0z8mm0TBdugyawGbxBH-YHH/view");
                startActivity(intent);

            }
        });
        botany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(biomaths.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1OfI2T-ateB_VwBC2K4vx_zKn2w_m6Z0E/view");
                startActivity(intent);

            }
        });
        zoology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(biomaths.this, webview.class);
                intent.putExtra("url","https://drive.google.com/file/d/1s1HnfRwwlThc194XLHP7C1g8fGHPfN-2/view");
                startActivity(intent);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(biomaths.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}