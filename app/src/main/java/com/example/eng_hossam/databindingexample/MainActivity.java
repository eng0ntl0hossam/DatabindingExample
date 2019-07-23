package com.example.eng_hossam.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.eng_hossam.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding= DataBindingUtil
                .setContentView(this,R.layout.activity_main);
        Contact contact = new Contact("Hossam", "Hawash");
        activityMainBinding.setHhh(contact);


        contact.setFirstname("sddsdsdd");
    }
}
