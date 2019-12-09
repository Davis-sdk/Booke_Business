package com.example.bookebusinessapplication.util;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Utility {

    public static final String INVALID_PASSWORD = "Please enter right password";
    public static final String USER_NOT_FOUND = "User not exist";
    public static final String KEY_USER_NAME  = "username";
    public static final String KEY_NAME = "name";
    public static final String BOOKE_APP = "Booke";
    public static final String USER_EMPLOYEE = "Employee";
    public static final String USER_EMPLOYER = "Employer";




    public static String dotToStarConverter(String s)
    {
        return String.valueOf(s).replace(".","*");
    }

    public static String dateItemConversion(String createDate)
    {
        try {
            long yourmilliseconds = Long.valueOf(createDate);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd,yyyy HH:mm");
            Date resultDate = new Date(yourmilliseconds);
            return simpleDateFormat.format(resultDate).toString();

        } catch (Exception e)
        {
            return "";


        }


    }



    public static void textEventListener(EditText editText, final Button button)
    {
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().trim().length() > 0)
                {
                    button.setEnabled(true);
                }else
                {
                    button.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }


}
