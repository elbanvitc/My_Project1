package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myproject.databinding.ActivityStMainBinding;

public class St_Main_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityStMainBinding stMainBind = DataBindingUtil.setContentView(this,R.layout.activity_st__main_);

        stMainBind.stMainActivityIvClenderImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(St_Main_Activity.this,St_Clender_Activity.class);
                startActivity(intent);
            }
        });
        stMainBind.stMainActivityIvStadiumImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(St_Main_Activity.this,St_profile_page.class);
                startActivity(intent);
            }
        });

    }
}