package com.example.bookebusinessapplication.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MessagesViewModel extends ViewModel{

    private MutableLiveData <String> mText;

    public MessagesViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("this is Message fragment");
    }

    public LiveData<String> getText() {return mText;}

}
