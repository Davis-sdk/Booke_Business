package com.example.bookebusinessapplication.ui.fragment;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Patterns;

import androidx.fragment.app.Fragment;

@SuppressLint("ValidFragment")
public class Register extends Fragment
{






    private static boolean isValidEmail(String email)
    {
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }



    private boolean validateUserType()
    {
        if(mBi)
    }


}
