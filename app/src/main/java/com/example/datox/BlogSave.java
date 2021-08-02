package com.example.datox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BlogSave extends AppCompatActivity {
    public TextView titleMe2, blogMe2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_save);

        titleMe2 = findViewById(R.id.titleMe2);
        blogMe2 = findViewById(R.id.blogMe2);

        String titleF1 = getIntent().getStringExtra("titleF");
        String blogF1 = getIntent().getStringExtra("blogF");

        titleMe2.setText(titleF1);
        blogMe2.setText(blogF1);

    }
}