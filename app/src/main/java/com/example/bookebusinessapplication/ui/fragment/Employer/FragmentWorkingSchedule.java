package com.example.bookebusinessapplication.ui.fragment.Employer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bookebusinessapplication.R;
import com.example.bookebusinessapplication.ui.viewmodel.employer.WorkingScheduleViewModel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class FragmentWorkingSchedule extends Fragment{

        private WorkingScheduleViewModel workingScheduleViewModel;

        public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
        {
            workingScheduleViewModel =
                    ViewModelProviders.of(this).get(WorkingScheduleViewModel.class);
            View root = inflater.inflate(R.layout.fragment_working_schedule, container, false);
            final TextView textView = root.findViewById(R.id.text_working_schedule);
            workingScheduleViewModel.getText().observe(this, new Observer <String>()
            {
               @Override
               public void onChanged(@Nullable String s)
               {
                   textView.setText(s);
               }

            });
            return root;

        }


}
