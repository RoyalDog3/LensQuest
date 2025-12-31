package com.example.lensquest1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 * This is the main activity of the application.
 * It is displayed after the welcome screen.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * This method is called when the activity is first created.
     * It is used to initialize the activity, such as setting the layout.
     * @param savedInstanceState If the activity is being re-initialized after previously being shut down then this Bundle contains the data it most recently supplied in onSaveInstanceState(Bundle). Note: Otherwise it is null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Calls the superclass's onCreate method to complete the creation of the activity
        super.onCreate(savedInstanceState);
        // Sets the layout for this activity
        setContentView(R.layout.activity_main);
    }
}
