package com.example.bookebusinessapplication.ui.fragment.Employer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bookebusinessapplication.R;
import com.example.bookebusinessapplication.ui.viewmodel.employer.ServiceViewModel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class FragmentServices extends Fragment{

    private ServiceViewModel serviceViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstance)
    {

        serviceViewModel =
                ViewModelProviders.of(this).get(ServiceViewModel.class);
                View root = inflater.inflate(R.layout.fragment_services, container, false);
                final TextView textView = root.findViewById(R.id.text_services);
                serviceViewModel.getText().observe(this, new Observer<String>()
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
