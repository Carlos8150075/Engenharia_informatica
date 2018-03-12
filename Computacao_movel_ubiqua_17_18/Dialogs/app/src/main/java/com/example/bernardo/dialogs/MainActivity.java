package com.example.bernardo.dialogs;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentA.OnNameListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(findViewById(R.id.fragment_container) != null)
            return;
        FragmentA fragmentA = new FragmentA();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_a, fragmentA).commit();
    }

    @Override
    public void onContactClicked(String name, String age, String phoneNumber) {
        FragmentB fragmentB = (FragmentB) getSupportFragmentManager().findFragmentById(R.id.fragment_b);
        if(fragmentB != null){
            fragmentB.setContactName(name);
        }else{
            fragmentB = new FragmentB();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, fragmentB);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}
