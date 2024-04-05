package com.example.vsbec;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ticketbooking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticketbooking);
    }

    public void busticket(View view) {

        String url = "https://www.redbus.in/";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }

    public void train_ticket(View view) {
        Intent intent=new Intent(ticketbooking.this, webview.class);
        intent.putExtra("url","https://www.irctc.co.in/nget/train-search");
        startActivity(intent);

    }

    public void flightticket(View view) {
        String url = "https://www.makemytrip.com/flights";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));

    }

    public void home1(View view) {
        Intent intent=new Intent(ticketbooking.this, MainActivity.class);
        startActivity(intent);
    }

    public void moviebooking(View view) {

        String url = "https://in.bookmyshow.com/explore/movies";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }
}