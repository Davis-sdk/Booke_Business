package com.example.bookebusinessapplication.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;

import com.example.bookebusinessapplication.R;
import com.example.bookebusinessapplication.init.UserSession;
import com.example.bookebusinessapplication.util.Utility;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity
{

    private static int SPLASH_DELAY = 1500;
    private UserSession session;
    private SharedPreferences sharedPreferences;
    private ProgressBar progressBar;
    private Timer timer;
    private int i=0;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        progressBar.setProgressTintList(ColorStateList.valueOf(Color.WHITE));

        progressBar.setProgress(0);






        session = new UserSession(getApplicationContext());

        sharedPreferences = getSharedPreferences(Utility.BOOKE_APP, Context.MODE_PRIVATE);
        final long period = 25;
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //this repeats every 100 ms
                if (i<100){
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {

                        }
                    });
                    progressBar.setProgress(i);
                    i++;
                }else{
                    //closing the timer
                    timer.cancel();


                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);

                    String sessionVar = "Employee";

                    if (!session.checkLogin()) {
                        HashMap<String, String> userDetail = session.getUserDetails();
//                        if (userDetail.get(UserSession.KEY_USER_TYPE).equals(Utility.USER_EMPLOYEE)) {
                        //temp var for now coz of no sharedPrefs declared
                        if (sessionVar.equals(Utility.USER_EMPLOYEE)) {


                        intent = new Intent(SplashScreen.this, EmployeeActivity.class);
                        } else {
                            intent = new Intent(SplashScreen.this, EmployerActivity.class);
                        }
                        intent.putExtra(Utility.KEY_USER_NAME, userDetail.get(UserSession.KEY_EMAIL));
                        intent.putExtra(Utility.KEY_NAME, userDetail.get(UserSession.KEY_NAME));

                    }

                    startActivity(intent);
                    finish();
                }
            }
        },SPLASH_DELAY,period);






    }
}
