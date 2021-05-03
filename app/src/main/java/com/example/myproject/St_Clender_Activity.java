package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

import com.example.myproject.databinding.ActivityStClenderBinding;

import java.util.ArrayList;
import java.util.Calendar;

public class St_Clender_Activity extends AppCompatActivity {
DatePickerDialog picker ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
ActivityStClenderBinding stClenderBind = DataBindingUtil.setContentView(this,R.layout.activity_st__clender_);
stClenderBind.stClenderActivityIvClender.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int mounth = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        picker = new DatePickerDialog(St_Clender_Activity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                stClenderBind.stClenderActivityTvDateForShown.setText("  "+i+" / "+i1+" / "+i2);
            }
        },year,mounth,day);
     picker.show();
    }
});

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        stClenderBind.stClenderActivityRvShownAppointment.setLayoutManager(lm);

        ArrayList<Class_Appointment> list_of_planed_appointment = new ArrayList<>();
        list_of_planed_appointment.add(new Class_Appointment("22/11/2020","1:00", "2:30","5","alex","ahly","ahmed","salm"));
        list_of_planed_appointment.add(new Class_Appointment("22/11/2020","1:00", "2:30","5","alex","ahly" ,"ahmed","salm"));
        list_of_planed_appointment.add(new Class_Appointment("22/11/2020","1:00","2:30","5","alex","ahly","ahmed","salm"));
        Appointment_Adepter adepter = new Appointment_Adepter(list_of_planed_appointment);
        stClenderBind.stClenderActivityRvShownAppointment.setAdapter(adepter);


    }
}