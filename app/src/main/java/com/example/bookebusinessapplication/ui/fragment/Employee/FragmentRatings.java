package com.example.bookebusinessapplication.ui.fragment.Employee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bookebusinessapplication.R;
import com.example.bookebusinessapplication.ui.viewmodel.employee.RatingViewModel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class FragmentRatings extends Fragment {

    private RatingViewModel ratingViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        ratingViewModel =
                ViewModelProviders.of(this).get(RatingViewModel.class);
                View root  = inflater.inflate(R.layout.fragment_ratings,container, false);
                final TextView textView = root.findViewById(R.id.text_ratings);
                ratingViewModel.getText().observe(this, new Observer <String>()
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
