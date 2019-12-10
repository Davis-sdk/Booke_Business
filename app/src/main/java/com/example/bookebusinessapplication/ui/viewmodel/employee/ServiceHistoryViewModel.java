package com.example.bookebusinessapplication.ui.viewmodel.employee;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ServiceHistoryViewModel extends  ViewModel {

    private MutableLiveData <String> mText;

    public ServiceHistoryViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is ServiceHistory fragment");

    }

    public LiveData<String> getText() { return mText;}

}
