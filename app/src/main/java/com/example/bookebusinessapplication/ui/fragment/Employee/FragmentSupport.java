package com.example.bookebusinessapplication.ui.fragment.Employee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bookebusinessapplication.R;
import com.example.bookebusinessapplication.ui.viewmodel.SupportViewModel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class FragmentSupport extends Fragment {

    private SupportViewModel supportViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        supportViewModel =
                ViewModelProviders.of(this).get(SupportViewModel.class);
            View root = inflater.inflate(R.layout.fragment_support, container, false);
            final TextView textView = root.findViewById(R.id.text_support);
            supportViewModel.getText().observe(this, new Observer <String>()
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
