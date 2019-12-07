package com.example.bookebusinessapplication.util;

import android.text.TextUtils;
import android.util.Patterns;

public class Validation {

    public static boolean isValidEmail(String email)
    {
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }



}
