package com.gdc.gmapdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_location);

        TextView tvCurrent = findViewById(R.id.tv_display_currentMap);
        String address = getIntent().getStringExtra("KEY_ADDRESS");
//        String city = getIntent().getStringExtra("KEY_CITY");
//        String state = getIntent().getStringExtra("KEY_STATE");
//        String country = getIntent().getStringExtra("KEY_COUNTRY");
        tvCurrent.setText(address);
    }
}
