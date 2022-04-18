package com.example.myapplication.Loading;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import com.kaopiz.kprogresshud.KProgressHUD;


public class ProgressHud {

    private Context context;
    public static KProgressHUD progressHUD;


    public ProgressHud(Context context) {
        this.context = context;
    }


    public void loading(Activity context){
        progressHUD = KProgressHUD.create(context)
        .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
        .setLabel("Please wait")
        .setDetailsLabel("Downloading data")
        .setAnimationSpeed(2)
        .setDimAmount(0.5f)
        .show();

    }


    public void dismiss(){
        progressHUD.dismiss();
        Log.e("TAG", "dismiss: ");
    }
}
