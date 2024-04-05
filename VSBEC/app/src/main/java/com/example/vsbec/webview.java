package com.example.vsbec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webview extends AppCompatActivity {
    private WebView mywebview;
    String url1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        url1=getIntent().getStringExtra("url");

        mywebview=findViewById(R.id.webview);
        mywebview.setWebViewClient(new WebViewClient());
        mywebview.getSettings().setJavaScriptEnabled(true);
        mywebview.getSettings().setGeolocationEnabled(true);
        mywebview.loadUrl(url1);
    }
    public class myWebViewclient extends WebViewClient{

        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            view.loadUrl(url);
            return true;
        }
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon){
            super.onPageStarted(view,url,favicon);

            final String urls=url;
            if (urls.contains("mailto")||urls.contains("whatsapp")||urls.contains("tel")){
                mywebview.stopLoading();
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urls));
                startActivity(intent);
            }
        }

    }

}