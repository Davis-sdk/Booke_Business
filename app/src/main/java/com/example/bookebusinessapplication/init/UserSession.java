package com.example.bookebusinessapplication.init;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;



import com.example.bookebusinessapplication.ui.activity.MainActivity;
import com.example.bookebusinessapplication.util.Utility;

import java.util.HashMap;

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



    public HashMap<String, String> getUserDetails()
    {

        HashMap <String, String> user = new HashMap<String, String>();
        user.put(KEY_NAME, sharedPreferences.getString(KEY_NAME, null));
        user.put(KEY_EMAIL, sharedPreferences.getString(KEY_EMAIL, null));
        user.put(KEY_USER_TYPE, sharedPreferences.getString(KEY_USER_TYPE, null));

        return user;
    }




    public boolean checkLogin()
    {
        if(!this.isUserLoggedIn())
        {
            Intent intent = new  Intent(mContext, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            mContext.startActivity(intent);
            return true;
        }
        return false;

    }





}
