package com.twitter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.twitter.databinding.ActivityMainBinding;


/**
 * OnCreate - Setup any thing we need for the activity
 * OnStart - The activity is visible at this point but user cant interact
 * OnResume - User can now interact with the activity
 * OnPause - The activity is visible but not in focus
 * OnStop - The activity is now in the background
 * OnRestart - Bring the activity back to the foreground
 * OnDestroy - The activity is destroyed
 * <p>
 * Intent - used to pass data, actions and communicate with other components
 * <p>
 * 2 Types
 * Explicit Intent - When you know and define the component to interact with
 * Implicit Intent - When you know the actions and let the OS show the user what
 * options can resolve the actions. ex. website link, the user will be shown a
 * chooser to select the browser they want to use to visit the link
 * <p>
 * Intent - used to pass data, actions and communicate with other components
 * <p>
 * 2 Types
 * Explicit Intent - When you know and define the component to interact with
 * Implicit Intent - When you know the actions and let the OS show the user what
 * options can resolve the actions. ex. website link, the user will be shown a
 * chooser to select the browser they want to use to visit the link
 */

/**
 * Intent - used to pass data, actions and communicate with other components
 *
 * 2 Types
 * Explicit Intent - When you know and define the component to interact with
 * Implicit Intent - When you know the actions and let the OS show the user what
 * options can resolve the actions. ex. website link, the user will be shown a
 * chooser to select the browser they want to use to visit the link
 */


/**
 * Getting the views from the xml
 * 1. in the module build.gradle add to the android scope
 * buildFeatures {
 *     viewBinding true
 * }
 *
 * 2. In the View that inflates the xml declare and initialize the binding created by the steps above
 * Note* The binding class generated is just the xml name in PascalCase
 * ex. activity_main = ActivityMainBinding
 */

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Log.d("MainActivity", "onCreate");
        binding.tvDisplay.setText("asdkfhsladhfhsadilhflisadihfldshfljbljbl");

        final Runnable r = new Runnable() {
            @Override
            public void run() {
                Intent anything = new Intent(MainActivity.this, SecondActivity.class);
                // Adding data to the Intent for next Component
                anything.putExtra("extraString", "Hello from MainActivity");

                startActivity(anything);
            }
        };
        new Handler().postDelayed(r, 5000);
    }

    /*    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }*/

}

