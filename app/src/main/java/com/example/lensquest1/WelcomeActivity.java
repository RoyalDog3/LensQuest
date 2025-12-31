package com.example.lensquest1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        View root = findViewById(R.id.welcomeRoot);
        root.setOnClickListener(v -> {
            startActivity(new Intent(WelcomeActivity.this, Sign.class));
            finish();
        });
    }
}
