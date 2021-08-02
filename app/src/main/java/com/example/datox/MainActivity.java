package com.example.datox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText displayMe;
    public EditText blogMe;
    public Button addMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayMe = findViewById(R.id.titleMe);
        blogMe = findViewById(R.id.blogMe);
        addMe = findViewById(R.id.addMe);

        addMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String titleBeta = displayMe.getText().toString();
                String blogBeta = blogMe.getText().toString();

                Intent intent = new Intent(MainActivity.this, BlogSave.class);

                intent.putExtra("titleF",titleBeta);
                intent.putExtra("blogF",blogBeta);

                startActivity(intent);
            }
        });
    }
}