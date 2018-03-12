package com.example.bernardo.button_toast_notification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        mTextView = (TextView) findViewById(R.id.result_text_view);
        String valor = getIntent().getStringExtra("texto");
        mTextView.setText(valor);
    }
}
