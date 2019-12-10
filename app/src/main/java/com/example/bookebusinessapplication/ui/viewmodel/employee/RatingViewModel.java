package com.example.bookebusinessapplication.ui.viewmodel.employee;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RatingViewModel extends ViewModel{

    private MutableLiveData <String> mText;

    public RatingViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is ratting fragmnet");
    }

    public LiveData<String> getText() {return mText;}

}
