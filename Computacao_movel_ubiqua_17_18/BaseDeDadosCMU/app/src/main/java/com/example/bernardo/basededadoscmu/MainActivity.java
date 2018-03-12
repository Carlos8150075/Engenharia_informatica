package com.example.bernardo.basededadoscmu;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        refreshSpinner();


        Button save = (Button) findViewById(R.id.save_person);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertPerson();
                refreshSpinner();
            }
        });

        Button delete = findViewById(R.id.deletePerson);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deletePerson();
                refreshSpinner();
            }
        });


    }

    public void insertPerson(){
        MyDBHelper dbHelper = new MyDBHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        EditText fname =  findViewById(R.id.first_name);
        EditText lname =  findViewById(R.id.second_name);
        ContentValues values = new ContentValues();
        values.put("fname", fname.getText().toString());
        values.put("lname", lname.getText().toString());
        db.insert("Pessoa", null, values);
        db.close();
    }


    public void refreshSpinner(){
        MyDBHelper dbHelper = new MyDBHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        ArrayList<Pessoa> persons = new ArrayList<>();
        ArrayList<Integer> ids = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT * FROM Pessoa", null);
        int i = 0;
        if(c != null && c.moveToFirst()){
            do{
                int id = c.getInt(0);
                String fname = c.getString(1);
                String lname = c.getString(2);
                Log.d("TESTE", "PESSOA " + id + ": " + fname + ", " + lname);
                persons.add(new Pessoa(id, fname, lname));
                ids.add(id);
            }while(c.moveToNext());
        }
        Spinner spinner = findViewById(R.id.persons);
        ArrayAdapter<Pessoa> adapter = new ArrayAdapter<Pessoa>(this, android.R.layout.simple_spinner_item, persons);
        spinner.setAdapter(adapter);
        c.close();
        db.close();
    }

    public void deletePerson(){
        MyDBHelper dbHelper = new MyDBHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Spinner spinner = findViewById(R.id.persons);
        Pessoa pessoa = (Pessoa) spinner.getSelectedItem();
        db.delete("Pessoa", "id= " + pessoa.getId(), null);
        db.close();
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
