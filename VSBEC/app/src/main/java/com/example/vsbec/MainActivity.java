package com.example.vsbec;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shopping(View view) {
        Intent intent=new Intent(MainActivity.this, shopping.class);
        startActivity(intent);
    }



    public void TicketBooking(View view) {
        Intent intent=new Intent(MainActivity.this, ticketbooking.class);
        startActivity(intent);
    }

    public void foodorder(View view) {
        Intent intent=new Intent(MainActivity.this, foodorder.class);
        startActivity(intent);
    }

    public void more(View view) {
        Intent intent=new Intent(MainActivity.this, webview.class);
        intent.putExtra("url","https://see-through-headset.000webhostapp.com/main.html");
        startActivity(intent);



        /* https://zoometric-crystal.000webhostapp.com/feedback1.html
        String url = "https://see-through-headset.000webhostapp.com/main.html";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));

         */
    }

    public void choosebranch(View view) {
        Intent intent=new Intent(MainActivity.this, choosebranch.class);
        startActivity(intent);
    }

    public void modelquestion(View view) {

        Intent intent=new Intent(MainActivity.this, chooseclassmodel.class);
        startActivity(intent);

    }

    public void youtube(View view) {
        Intent intent=new Intent(MainActivity.this, webview.class);
        intent.putExtra("url","https://www.youtube.com/@VSBECIT");
        startActivity(intent);
    }

    public void logout(View view) {
        new AlertDialog.Builder(this)
                .setMessage("Do you want to exit the app?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // If the user chooses to exit, finish the activity
                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();

    }
    @Override
    public void onBackPressed() {
        // When the back button is pressed, show a confirmation dialog
        new AlertDialog.Builder(this)
                .setMessage("Do you want to exit the app?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // If the user chooses to exit, finish the activity
                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();}

}