package com.example.mirimimplicitintent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCall = findViewById(R.id.btn_call);
        Button btnWab = findViewById(R.id.btn_home_open);
        Button btnMap = findViewById(R.id.btn_map);
        Button btnSearch = findViewById(R.id.btn_search);
        Button btnSms = findViewById(R.id.btn_sms);
        Button btnCamera = findViewById(R.id.btn_camera);

        btnCall.setOnClickListener(btnListener);
        btnWab.setOnClickListener(btnListener);
        btnMap.setOnClickListener(btnListener);
        btnSearch.setOnClickListener(btnListener);
        btnSms.setOnClickListener(btnListener);
        btnCamera.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}