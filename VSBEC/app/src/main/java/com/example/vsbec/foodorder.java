package com.example.vsbec;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class foodorder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodorder);
    }

    public void swiggy(View view) {

        String url = "https://www.swiggy.com/";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }

    public void zomato(View view) {

        String url = "https://www.zomato.com/karur";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }

    public void justdail(View view) {

        String url = "https://www.justdial.com/Karur/Home-Delivery-Restaurants/nct-10250324";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }

    public void flyereats(View view) {

        String url = "https://flyereats-karur.business.site/";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }

    public void home3(View view) {
        Intent intent=new Intent(foodorder.this, MainActivity.class);
        startActivity(intent);
    }
}