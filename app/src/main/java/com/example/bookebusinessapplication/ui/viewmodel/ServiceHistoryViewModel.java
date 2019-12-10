package com.example.bookebusinessapplication.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ServiceHistoryViewModel extends  ViewModel {

    private MutableLiveData <String> mText;

    public ServiceHistoryViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");

    }

    public LiveData<String> getText() { return mText;}

}
