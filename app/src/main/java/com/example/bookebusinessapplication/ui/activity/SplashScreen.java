package com.example.bookebusinessapplication.ui.activity;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.bookebusinessapplication.R;
import com.example.bookebusinessapplication.init.UserSession;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity
{

    private static int SPLASH_DELAY = 3000;
    private UserSession session;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_splash_screen);





    }
}
