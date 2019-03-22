package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.utils.AppConstants;

public class NewActivity extends AppCompatActivity {
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        mText = findViewById(R.id.tv_message);
        Intent mIntent = this.getIntent();
        if (mIntent != null) {
            mText.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
        }

    }
}
