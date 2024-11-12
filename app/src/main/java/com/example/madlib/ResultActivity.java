package com.example.madlib;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView resultTextView = findViewById(R.id.resultTextView);

        int templateId = getIntent().getIntExtra("TEMPLATE_ID", 1);
        String word1 = getIntent().getStringExtra("WORD1");
        String word2 = getIntent().getStringExtra("WORD2");
        String word3 = getIntent().getStringExtra("WORD3");
        String word4 = getIntent().getStringExtra("WORD4");
        String word5 = getIntent().getStringExtra("WORD5");
        String word6 = getIntent().getStringExtra("WORD6");
        String word7 = getIntent().getStringExtra("WORD7");
        String word8 = getIntent().getStringExtra("WORD8");

        String madLib = generateMadLib(templateId, word1, word2, word3, word4, word5, word6, word7, word8);
        resultTextView.setText(madLib);
    }

    private String generateMadLib(int templateId, String... words) {
        switch (templateId) {
            case 1:
                return "The " + words[0] + " decided to " + words[1] + " at the " + words[2] + " place...";
            case 2:
                return "One day, a " + words[3] + " and a " + words[4] + " decided to " + words[5] + " together...";
            case 3:
                return "It was a " + words[6] + " day when I heard, '" + words[7] + "'...";
            default:
                return "Unexpected template.";
        }
    }
}
