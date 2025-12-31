package com.example.lensquest1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoginFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_login, container, false);

        Button loginButton = view.findViewById(R.id.loginButton);
        TextView goToSignup = view.findViewById(R.id.goToSignup);

        loginButton.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), MainActivity.class));
            requireActivity().finish();
        });

        goToSignup.setOnClickListener(v -> {
            requireActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.sign_fragment_container, new SignupFragment())
                    .addToBackStack(null)
                    .commit();
        });

        return view;
    }
}
