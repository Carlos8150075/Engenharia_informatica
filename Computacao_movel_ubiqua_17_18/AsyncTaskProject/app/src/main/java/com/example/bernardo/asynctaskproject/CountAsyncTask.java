package com.example.bernardo.asynctaskproject;

import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Bernardo on 05/12/2017.
 */

public class CountAsyncTask extends AsyncTask<Integer, Integer, Integer> {
    private  TextView textView;

    public CountAsyncTask(TextView textView) {
        this.textView = textView;
    }

    @Override
    protected Integer doInBackground(Integer... integers) {
        int count = integers[0];
        try{
        for(int i = 0; i < count; i++){
            publishProgress(i+1);

                Thread.sleep(1000);

        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        textView.setText(values[0].toString());
    }

    @Override
    protected void onPostExecute(Integer integer) {
        textView.setText(R.string.sucess);
    }

    @Override
    protected void onCancelled() {
        textView.setText(R.string.cancelCount);
    }
}
