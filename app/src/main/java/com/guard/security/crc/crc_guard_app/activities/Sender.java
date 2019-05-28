package com.guard.security.crc.crc_guard_app.activities;

import android.Manifest;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.webkit.WebView;

import com.guard.security.crc.crc_guard_app.model.GlobalVariables;
import com.guard.security.crc.crc_guard_app.util.GPSRastreador;
import com.guard.security.crc.crc_guard_app.util.Global;
import com.guard.security.crc.crc_guard_app.webview.WebInterface;
import com.guard.security.crc.crc_guard_app.webview.mWebClient;

public class Sender extends BroadcastReceiver {
    private String mURL = "http://186.96.89.66:9090/crccoding/f?p=2560:9999";
    private GPSRastreador gvGPS;
    private int Llamadas = 0;
    @Override
    public void onReceive(final Context context, Intent intent) {
       /* WebView gv = new WebView(context);
        gv.setWebViewClient(new mWebClient());
        gv.getSettings().setJavaScriptEnabled(true);
        gv.addJavascriptInterface(new WebInterface(context, gvGPS), "Android");
        gv.loadUrl(mURL);
        gvGPS = new GPSRastreador(context);
        Log.i("PRUEBA","sender"+gv.getUrl());

        gv.setWebViewClient(new mWebClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                if (Llamadas == 0) {
                    view.loadUrl("javascript:prueba('" + obtenerIdentificador(context) + "'" +
                            ",'" + gvGPS.obtenerLatitud() + "'" +
                            ",'" + gvGPS.obtenerLongitud() + "');");
                    Log.i("PRUEBA", "CREADO");
                    //GlobalVariables s = new GlobalVariables().getInstance();
                    //s.setmUrl(url);

                }
                Llamadas +=1;
            }
        });*/
    }
    public String obtenerIdentificador(Context gvContext) {
        TelephonyManager telephonyManager = (TelephonyManager) gvContext.getSystemService(Context.TELEPHONY_SERVICE);
        if (ActivityCompat.checkSelfPermission(gvContext, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return telephonyManager.getImei();
        } else {
            return telephonyManager.getDeviceId();
        }
    }
}
