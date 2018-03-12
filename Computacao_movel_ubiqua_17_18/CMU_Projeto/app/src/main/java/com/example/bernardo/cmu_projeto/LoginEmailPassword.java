package com.example.bernardo.cmu_projeto;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by Bernardo on 28/11/2017.
 */

public class LoginEmailPassword extends AppCompatActivity{
    private static final String TAG = "EmailPassword";
    private FirebaseAuth mAuth;

    private TextView mStatusView;
    private EditText mEmailField;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        mEmailField = findViewById(R.id.email_field);
        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }





}




