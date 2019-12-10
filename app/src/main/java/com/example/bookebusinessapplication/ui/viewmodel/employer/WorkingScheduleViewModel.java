package com.example.bookebusinessapplication.ui.viewmodel.employer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WorkingScheduleViewModel extends ViewModel {

       private MutableLiveData <String> mText;

       public WorkingScheduleViewModel()
       {
           mText = new MutableLiveData<>();
           mText.setValue("This is Working Schedule fragments");
       }
       public LiveData<String> getText() {return mText;}

}
