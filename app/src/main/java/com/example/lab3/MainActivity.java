package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String firstName;
    String lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("dll_debug", "created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("dll_debug", "started");
    }

    protected  void onResume(Bundle savedInstaceState) {
        super.onResume();
        Log.d("dll_debug", "resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("dll_debug","paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("dll_debug", "stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("dll_debug", "destroyed");
    }
   /* @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.d("dll_debug", "aaaa");
        outState.putString("FIRST_NAME", getFirstNameField());
        outState.putString("LAST_NAME", getLastNameField());
        // call superclass to save any view hierarchy
        super.onSaveInstanceState(outState);
    }*/

    public String getFirstNameField(){
        TextView firstName = (TextView) findViewById(R.id.editTextFirstName);
        return firstName.getText().toString();
    }

    public String getLastNameField(){
        TextView lastName = (TextView) findViewById(R.id.editTextLastName);
        return lastName.getText().toString();
    }


}