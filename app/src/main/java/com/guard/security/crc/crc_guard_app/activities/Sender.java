package com.guard.security.crc.crc_guard_app.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;

import com.guard.security.crc.crc_guard_app.util.GPSRastreador;
import com.guard.security.crc.crc_guard_app.webview.WebInterface;
import com.guard.security.crc.crc_guard_app.webview.mWebClient;

public class Sender extends BroadcastReceiver {
    private String mURL = "http://10.1.1.12:9090/crccoding/f?p=103:1";
    private GPSRastreador gvGPS;


    @Override
    public void onReceive(final Context context, Intent intent) {
       /*  dbhelper = new DatabaseHandler(context, "RG", null, 1);
        mURL = dbhelper.Obt_url();
        if (mURL == ""){
            mURL = "http://186.96.89.66:9090/crccoding/f?p=2560:9999";
            Log.i("SQLL","Url vacio");
        }else{
            Log.i("SQLL","Url cargado   "+mURL);
        }*/
        WebView gv = new WebView(context);
        gv.setWebViewClient(new mWebClient());
        gv.getSettings().setJavaScriptEnabled(true);
        gv.addJavascriptInterface(new WebInterface(context, gvGPS, null), "Android");
        gv.loadUrl(mURL);
    }

}
