package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Signup");


    }




    public void btn_dashboard(View view) {
        startActivity(new Intent(getApplicationContext(),Dashboard.class));
    }

    public void btn_signup(View view) {
        startActivity(new Intent(getApplicationContext(),signup.class));
    }
}

