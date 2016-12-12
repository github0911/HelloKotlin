package com.example.hellokotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(this, "ActivitySecond", Toast.LENGTH_SHORT).show();
    }
}
