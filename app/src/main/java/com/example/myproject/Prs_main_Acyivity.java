package com.example.myproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class Prs_main_Acyivity extends AppCompatActivity {
    Appointment_Adepter adepter;
final static int CREAT_APPOINTMENT_REQUST_CODE = 8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.myproject.databinding.ActivityPrsMainAcyivityBinding prs_main_bind = DataBindingUtil.setContentView(this,R.layout.activity_prs_main__acyivity);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);


        ArrayList<Class_Appointment> list_of_appointment = new ArrayList<>();
        list_of_appointment.add(new Class_Appointment("14/8","7:50","8:50","7","cairo","cairo stadium2" ,"ahmrf","yoyo"));
        list_of_appointment.add(new Class_Appointment("14/8","7:50","8:50","5","cairo2","cairo stadium2\3" ,"ahmrf","yoyo"));
        list_of_appointment.add(new Class_Appointment("14/8","7:50","8:50","7","cairo3","cairo stadium2" ,"ahmrf","yoyo"));
        adepter = new Appointment_Adepter(list_of_appointment);

        prs_main_bind.prsMainActivityRvReservation.setLayoutManager(lm);
        prs_main_bind.prsMainActivityRvReservation.setAdapter(adepter);
        // profile image >>>>. profile page
        prs_main_bind.prsMainActivityIvProfileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Prs_main_Acyivity.this,Prs_Profile_Page.class);
                startActivity(intent);
            }
        });
        ///////////////////////////////////
        //
        // fabtn creat  >>>>>>   make appointment
        prs_main_bind.prsMainActivityFabtnCreatReservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Prs_main_Acyivity.this,Make_Appointment.class);
                startActivityForResult(intent,CREAT_APPOINTMENT_REQUST_CODE);
            }
        });
        ///////////////////////////////////
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    //if (requestCode == CREAT_APPOINTMENT_REQUST_CODE && requestCode == RESULT_OK){        .<<<<   unKnown error
        Class_Appointment p = (Class_Appointment) data.getSerializableExtra(Make_Appointment.APPOINTMENT_KEY);
        Toast.makeText(this, ""+p.getAppointment_kaptin1_name(), Toast.LENGTH_LONG).show();

        adepter.addItem(p);

    //}


    }
}