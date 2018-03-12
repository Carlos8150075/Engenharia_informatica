package com.example.bernardo.button_toast_notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toastButton	=	(Button)	findViewById(R.id.button_toast);
        mEditText = (EditText) findViewById(R.id.editText);
        Button notification_button = (Button) findViewById(R.id.button_notification);
        Button cancel_notification = (Button) findViewById(R.id.cancel_notification);
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                String valor = mEditText.getText().toString();
                Toast.makeText(MainActivity.this, valor, Toast.LENGTH_SHORT).show();
            }
        });
        Button activity_button = (Button) findViewById(R.id.button_activity);
        activity_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String valor = mEditText.getText().toString();
                Intent myIntent = new Intent(MainActivity.this, NewActivity.class);
                myIntent.putExtra("Texto", valor);
                startActivity(myIntent);

            }
        });
        notification_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity.this);
                String valor = mEditText.getText().toString();
                mBuilder.setSmallIcon(R.drawable.images);
                mBuilder.setContentTitle("Texto:");
                mBuilder.setContentText(valor);
                int IdNotification = 1;

                Intent resultIntent = new Intent(MainActivity.this, ResultActivity.class);
                resultIntent.putExtra("texto",valor);
                PendingIntent resultPendingIntent = PendingIntent.getActivity(MainActivity.this,0,resultIntent,PendingIntent.FLAG_UPDATE_CURRENT);










                mBuilder.setAutoCancel(true);
                mBuilder.setContentIntent(resultPendingIntent);

                NotificationManager Nmanager  = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Nmanager.notify(IdNotification,mBuilder.build());
            }
        });
        cancel_notification.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                int IdNotification = 1;
                NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                manager.cancel(IdNotification);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
