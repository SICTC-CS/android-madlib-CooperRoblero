package com.example.madlib;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setting up buttons for each Mad Lib choice and random generation
        findViewById(R.id.madlib1Button).setOnClickListener(v -> openInputActivity(1));
        findViewById(R.id.madlib2Button).setOnClickListener(v -> openInputActivity(2));
        findViewById(R.id.madlib3Button).setOnClickListener(v -> openInputActivity(3));
        findViewById(R.id.randomMadlibButton).setOnClickListener(v -> {
            int randomMadlib = new Random().nextInt(3) + 1;
            openInputActivity(randomMadlib);
        });
    }

    private void openInputActivity(int templateId) {
        Intent intent = new Intent(MainActivity.this, InputActivity.class);
        intent.putExtra("TEMPLATE_ID", templateId);
        startActivity(intent);
    }
}
