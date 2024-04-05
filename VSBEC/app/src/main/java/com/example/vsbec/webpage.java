package com.example.vsbec;

import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class webpage extends AppCompatActivity {
    WebView wv;
    String url1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webpage);

        wv=(WebView) findViewById(R.id.wv);

        url1=getIntent().getStringExtra("url");

        wv.loadUrl(url1);

        //wv.loadUrl("https://drive.google.com/file/d/1rLKsOBA0CGYIAbtlQmJYQu3PsGmwPw9M/view?usp=sharing");

        wv.setWebViewClient(new client());
        WebSettings ws=wv.getSettings();
        ws.setJavaScriptEnabled(true);
        wv.clearCache(true);
        wv.clearHistory();
        wv.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String s1, String s2, String s3, long l) {
                DownloadManager.Request req = new DownloadManager.Request(Uri.parse(url));
                req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                DownloadManager dm=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(req);
                Toast.makeText(getApplicationContext(), "Downloading started.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private class client extends WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {

            super.onPageFinished(view, url);
        }
    }
}