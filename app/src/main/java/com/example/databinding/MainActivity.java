package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databinding.databinding.ActivityMainBinding;
import com.example.databinding.model.TestModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding bindingTest = ActivityMainBinding.inflate(getLayoutInflater()); //DataBindingUtil.setContentView(this, R.layout.activity_main);
        TestModel test = new TestModel("Hello Ram");
        bindingTest.setBind(test);
    }
}