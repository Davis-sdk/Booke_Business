package com.example.bookebusinessapplication.ui.fragment.Employee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bookebusinessapplication.R;
import com.example.bookebusinessapplication.ui.viewmodel.employee.ServiceHistoryViewModel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class FragmentServiceHistory extends Fragment
{
    private ServiceHistoryViewModel serviceHistoryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        serviceHistoryViewModel =
                ViewModelProviders.of(this).get(ServiceHistoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_service_history, container, false);
        final TextView textView = root.findViewById(R.id.text_service_history);
        serviceHistoryViewModel.getText().observe(this, new Observer <String>()
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
