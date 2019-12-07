package com.example.bookebusinessapplication.init;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import com.example.bookebusinessapplication.data.model.User;
import com.example.bookebusinessapplication.ui.activity.MainActivity;
import com.example.bookebusinessapplication.util.Utility;

public class UserSession {

    // Shared Preferences refrences
    SharedPreferences sharedPreferences;

    //Editor for Shared Preferences
    Editor editor;

    Context mContext;

    //Shared Preferences Mode
    int PRIVATE_MODE = 0;

    //shared prefs file name
    public static final String PREFER_NAME = Utility.BOOKE_APP;

    public static final String IS_LOGGED_IN = "IsUserLoggedIn";

    public static final String KEY_NAME ="Name";

    public static final String KEY_EMAIL ="Email";

    //password
    public static final String KEY_PASSWORD ="txtPassword";

    public static final String KEY_USER_TYPE ="userType";



    public UserSession(Context context)
    {
        this.mContext = context;
        sharedPreferences = mContext.getSharedPreferences(PREFER_NAME, PRIVATE_MODE);
        editor = sharedPreferences.edit();
    }


    //Login Session
    public void createUserLoginSession(String uName, String uEmail, String uPassword, String uType)
    {

        //Storing name in preferences
        editor.putString(KEY_NAME, uName);

        //Storing login value as TRUE
        editor.putBoolean(IS_LOGGED_IN, true);

        //Storing username in preferences
        editor.putString(KEY_EMAIL, uEmail);

        //Storing password in preferences
        editor.putString(KEY_PASSWORD, uPassword);

        //Storing type in preferences
        editor.putString(KEY_USER_TYPE, uType);

        //commit changes
        editor.commit();
    }

    public boolean isUserLoggedIn()
    {
        return sharedPreferences.getBoolean(IS_LOGGED_IN,false);
    }


    public void logoutUser()
    {
        //Clearing all user data from Shared Preferences
        editor.clear();
        editor.commit();

        Intent intent = new Intent(mContext, MainActivity.class);

        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        mContext.startActivity(intent);
    }




}
