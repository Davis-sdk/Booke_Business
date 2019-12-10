package com.example.bookebusinessapplication.ui.viewmodel.employee;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SpecialViewModel extends ViewModel {

    private MutableLiveData <String> mText;

    public SpecialViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is SpecialFragment");
    }


    public LiveData <String> getText() {return mText;}

}
