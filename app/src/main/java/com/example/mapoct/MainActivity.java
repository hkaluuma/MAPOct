package com.example.mapoct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //my class variables/ instance variables
    //declaring variable
    private String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Changes below
        //instantiation / Creating an object
        Cat catobject = new Cat();
        result = catobject.chase_animal;
        System.out.println("*************** " + result);

    }
}