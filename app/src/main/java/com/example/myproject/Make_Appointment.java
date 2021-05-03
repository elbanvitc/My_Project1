package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.myproject.databinding.ActivityMakeAppointmentBinding;

import java.time.Year;
import java.util.Calendar;

public class Make_Appointment extends AppCompatActivity {
final static String APPOINTMENT_KEY = "apo1";
DatePickerDialog datePicker ;
TimePickerDialog timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Calendar calendar = Calendar.getInstance();
        ActivityMakeAppointmentBinding makeAppointmentBind = DataBindingUtil.setContentView(this,R.layout.activity_make__appointment);

        makeAppointmentBind.prsMakeAppointmentActivityTvDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int year = calendar.get(Calendar.YEAR);
                int mounth = calendar.get(Calendar.MONTH)+1;
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                datePicker = new DatePickerDialog(Make_Appointment.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        makeAppointmentBind.prsMakeAppointmentActivityEtTimeDate.setVisibility(View.VISIBLE);
                        makeAppointmentBind.prsMakeAppointmentActivityEtTimeDate.setText(i+" / "+i1+" / "+ i2);
                    }
                }, year,mounth,day);
                datePicker.show();

            }
        });
        makeAppointmentBind.prsMakeAppointmentActivityTvTimeFrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                int minute = calendar.get(Calendar.MINUTE);

                timePicker = new TimePickerDialog(Make_Appointment.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        makeAppointmentBind.prsMakeAppointmentActivityEtTimeFrom.setVisibility(View.VISIBLE);
                        makeAppointmentBind.prsMakeAppointmentActivityEtTimeFrom.setText(""+i+" : "+i1);
                    }
                },hour,minute,true);
                timePicker.show();
            }

        });
        makeAppointmentBind.prsMakeAppointmentActivityTvTimeTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                int minute = calendar.get(Calendar.MINUTE);
                timePicker = new TimePickerDialog(Make_Appointment.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        makeAppointmentBind.prsMakeAppointmentActivityEtTimeTo.setVisibility(View.VISIBLE);
                        makeAppointmentBind.prsMakeAppointmentActivityEtTimeTo.setText(i+" : "+i1);
                    }
                },hour,minute,true);
                timePicker.show();
            }
        });

        makeAppointmentBind.prsMakeAppointmentActivityFabtnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String date = makeAppointmentBind.prsMakeAppointmentActivityEtTimeDate.getText().toString();
                String start = makeAppointmentBind.prsMakeAppointmentActivityEtTimeFrom.getText().toString();
                String end = makeAppointmentBind.prsMakeAppointmentActivityEtTimeTo.getText().toString();
                String num_of_players = makeAppointmentBind.prsMakeAppointmentActivityEtNumOfPlayers.getText().toString();
                String stadium_location = "cairo";
                String stadium_name = "cairo stadium";
                String kaptin1_name = "ahmed";
                String kaptin2_name = "elbana";

                Class_Appointment appointment = new Class_Appointment(date,start,end,num_of_players,stadium_location,stadium_name,kaptin1_name,kaptin2_name);

                //Toast.makeText(Make_Appointment.this, ""+ appointment.getAppointment_date(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();

                intent.putExtra(APPOINTMENT_KEY,appointment);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }
}