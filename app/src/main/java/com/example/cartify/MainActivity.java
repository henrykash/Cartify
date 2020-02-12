package com.example.cartify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.cartify.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // data binding

    ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
    }
}
