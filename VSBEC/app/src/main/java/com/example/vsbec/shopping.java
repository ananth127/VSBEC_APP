package com.example.vsbec;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class shopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
    }

    public void Amazon(View view) {
        Intent intent=new Intent(shopping.this, webpage.class);
        intent.putExtra("url","https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=7520472555116559086&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9148874&hvtargid=kwd-10573980&hydadcr=14453_2316415https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=7520472555116559086&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9148874&hvtargid=kwd-10573980&hydadcr=14453_2316415");
        startActivity(intent);
    }

    public void flipkart(View view) {
        Intent intent=new Intent(shopping.this, webview.class);
        intent.putExtra("url","https://www.flipkart.com/");
        startActivity(intent);
    }

    public void meesho(View view) {
        String url = "https://www.meesho.com/";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }

    public void home4(View view) {
        Intent intent=new Intent(shopping.this, MainActivity.class);
        startActivity(intent);
    }
}