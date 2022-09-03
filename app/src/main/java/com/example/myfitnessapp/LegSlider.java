package com.example.myfitnessapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class LegSlider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_slider);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        LegAdapter adapter = new LegAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
