package com.example.bernardo.asynctaskproject;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CountAsyncTask countAsyncTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button countBtn = findViewById(R.id.count_button);
        Button cancel_count = findViewById(R.id.cancel_button);


        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(countAsyncTask == null || countAsyncTask.getStatus() == AsyncTask.Status.FINISHED){
                    startAsyncTask();
                }else if (countAsyncTask != null && countAsyncTask.getStatus() == AsyncTask.Status.RUNNING){
                    stopAsyncTask();
                    startAsyncTask();
                }

            }
        });

        cancel_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAsyncTask();
            }
        });
    }

    public void startAsyncTask(){

        final TextView status = findViewById(R.id.Status_editText);
        final EditText number = findViewById(R.id.editText);


        this.countAsyncTask = new CountAsyncTask(status);

        countAsyncTask
                .execute(Integer.parseInt(number.getText().toString()));
    }

    public void stopAsyncTask(){
        if(countAsyncTask != null){
            countAsyncTask.cancel(true);
        }

    }
}
