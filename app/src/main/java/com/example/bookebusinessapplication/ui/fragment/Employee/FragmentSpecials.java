package com.example.bookebusinessapplication.ui.fragment.Employee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bookebusinessapplication.R;
import com.example.bookebusinessapplication.ui.viewmodel.SpecialViewModel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class FragmentSpecials extends Fragment{

    private SpecialViewModel fragmentSpecials;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        fragmentSpecials =
                ViewModelProviders.of(this).get(SpecialViewModel.class);
        View root = inflater.inflate(R.layout.fragment_specials, container, false);
        final TextView textView = root.findViewById(R.id.text_special);
        fragmentSpecials.getText().observe(this, new Observer <String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }

        });
        return root;


    }


}
