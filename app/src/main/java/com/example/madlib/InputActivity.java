package com.example.madlib;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class InputActivity extends AppCompatActivity {

    private EditText input1, input2, input3, input4, input5, input6, input7, input8;
    private int templateId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        templateId = getIntent().getIntExtra("TEMPLATE_ID", 1);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        input4 = findViewById(R.id.input4);
        input5 = findViewById(R.id.input5);
        input6 = findViewById(R.id.input6);
        input7 = findViewById(R.id.input7);
        input8 = findViewById(R.id.input8);

        Button generateButton = findViewById(R.id.generateButton);
        generateButton.setOnClickListener(v -> generateMadLib());
    }

    private void generateMadLib() {
        Intent intent = new Intent(InputActivity.this, ResultActivity.class);
        intent.putExtra("TEMPLATE_ID", templateId);
        intent.putExtra("WORD1", input1.getText().toString());
        intent.putExtra("WORD2", input2.getText().toString());
        intent.putExtra("WORD3", input3.getText().toString());
        intent.putExtra("WORD4", input4.getText().toString());
        intent.putExtra("WORD5", input5.getText().toString());
        intent.putExtra("WORD6", input6.getText().toString());
        intent.putExtra("WORD7", input7.getText().toString());
        intent.putExtra("WORD8", input8.getText().toString());
        startActivity(intent);
    }
}
