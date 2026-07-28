package com.reptile.app;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.webkit.WebChromeClient;
public class MainActivity extends Activity{
private static final String URL="https://taikenle.github.io/reptile/reptile-app.html";
private WebView wv;
@Override
protected void onCreate(Bundle b){
super.onCreate(b);
wv=new WebView(this);
setContentView(wv);
WebSettings s=wv.getSettings();
s.setJavaScriptEnabled(true);
s.setDomStorageEnabled(true);
s.setDatabaseEnabled(true);
s.setUseWideViewPort(true);
s.setLoadWithOverviewMode(true);
wv.setWebViewClient(new WebViewClient());
wv.setWebChromeClient(new WebChromeClient());
wv.loadUrl(URL);
}
@Override
public void onBackPressed(){
if(wv.canGoBack())wv.goBack();
else super.onBackPressed();
}
}
