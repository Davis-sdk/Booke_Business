package com.example.bookebusinessapplication.ui.viewmodel.employer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData <String> mText;

    public HomeViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is Employer Home fragment");
    }

    public LiveData<String> getText() {return mText;}

}
