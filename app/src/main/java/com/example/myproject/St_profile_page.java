package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.myproject.databinding.ActivityStProfilePageBinding;

public class St_profile_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

ActivityStProfilePageBinding stProfileBinding  = DataBindingUtil.setContentView(this,R.layout.activity_st_profile_page);
stProfileBinding.stProfileActivityIvClender.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(St_profile_page.this,St_Clender_Activity.class);
        startActivity(intent);
    }
});
stProfileBinding.stProfileActivityTvStadiumCallMangerPhone1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String phone1 = stProfileBinding.stProfileActivityTvStadiumMangerPhone1.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone1));
        startActivity(intent);
    }
});
stProfileBinding.stProfileActivityTvStadiumCallMangerPhone2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String phone2 = stProfileBinding.stProfileActivityTvStadiumMangerPhone2.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone2));
        startActivity(intent);

    }
});
        stProfileBinding.stProfileActivityTvStadiumLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(St_profile_page.this,MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}