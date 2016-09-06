package com.agte.vivo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Dms extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dms);

        WebView mWebView = (WebView) findViewById(R.id.webView);

        mWebView.loadUrl("http://agtevivo.byethost7.com");
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setSaveFormData(true);
        mWebView.getSettings().setBuiltInZoomControls(true);
        mWebView.setWebViewClient(new MyWebViewClient());
    }

        private class MyWebViewClient extends WebViewClient
        {

            @Override
//show the web page in webview but not in web browser
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl (url);
                return true;
            }
        }

    }
