package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import com.example.myapplication.Loading.ProgressHud;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MAIN_ACTIVITY";
    private AppCompatButton show,dismiss;
    private ProgressHud progressHud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpUI();
        setUpBtn_clicks();
        doFirstWork();
    }


    private void setUpUI(){

        show =    findViewById(R.id.show);
        dismiss = findViewById(R.id.dismiss);

        progressHud = new ProgressHud(this);


    }
    private void setUpBtn_clicks(){


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                progressHud.loading(MainActivity.this);
            }
        });

        dismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }

    private void doFirstWork() {
        Handler handler = new Handler();

            handler.postDelayed(new Runnable() {
                public void run() {
                    progressHud.dismiss();
                    Log.e(TAG, "doFirstWork: "+"Timer done");
                }
            }, 2000);

        Log.e(TAG, "doFirstWork: "+"Timer start");
        progressHud.loading(MainActivity.this);
        }
}