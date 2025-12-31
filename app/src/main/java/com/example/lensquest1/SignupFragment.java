package com.example.lensquest1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SignupFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_signup, container, false);

        TextView goToLogin = view.findViewById(R.id.goToLogin);
        goToLogin.setOnClickListener(v ->
                requireActivity().getSupportFragmentManager().popBackStack()
        );

        return view;
    }
}
