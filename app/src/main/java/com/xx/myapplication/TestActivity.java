package com.xx.myapplication;

import android.os.Bundle;

import com.xx.testapplication.MainActivity;

public class TestActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
