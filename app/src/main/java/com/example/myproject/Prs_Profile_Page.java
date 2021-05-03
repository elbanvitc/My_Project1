package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myproject.databinding.ActivityPrsProfilePageBinding;

public class Prs_Profile_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityPrsProfilePageBinding profilePageBind = DataBindingUtil.setContentView(this,R.layout.activity_prs__profile__page);
////////////////   setOnLongClickListener !!???




        profilePageBind.prsRegistrationActivityEtName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                Toast.makeText(Prs_Profile_Page.this, "name .....", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }
}