package com.abdularis.app.tvstaticeffectsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.abdularis.app.analogtvnoise.AnalogTvNoise;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHideShowClick(View view) {
        AnalogTvNoise v = findViewById(R.id.noise);
        if (v.getVisibility() == View.GONE) {
            v.setVisibility(View.VISIBLE);
        } else {
            v.setVisibility(View.GONE);
        }
    }
}
