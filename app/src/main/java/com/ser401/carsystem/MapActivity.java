package com.ser401.carsystem;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView maps_webview = (WebView) findViewById(R.id.maps_webview);
        maps_webview.setWebViewClient(new WebViewClient());
        maps_webview.getSettings().setJavaScriptEnabled(true);
        maps_webview.loadUrl("http://maps.google.com/maps");


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
