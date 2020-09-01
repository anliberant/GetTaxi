package com.example.gettaxi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseModeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_mode);

    }

    public void goToDriverSignIn(View view) {
        startActivity(new Intent(ChooseModeActivity.this, DriverSignInActivity.class));
    }

    public void goToPassengerSignIn(View view) {
        startActivity(new Intent(ChooseModeActivity.this, PassengerSignInActivity.class));
    }
}