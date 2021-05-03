package com.example.myproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Appointment_Adepter extends RecyclerView.Adapter<Appointment_Holder> {

    ArrayList<Class_Appointment> list_of_appointments ;

    public Appointment_Adepter(ArrayList<Class_Appointment> list_of_appointments) {
        this.list_of_appointments = list_of_appointments;
    }
    public void addItem(Class_Appointment classAppointment){
        list_of_appointments.add(classAppointment);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Appointment_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

     View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.appointment_layout,null,false);
     Appointment_Holder holder = new Appointment_Holder(v);
        return holder;
    }
    @Override
    public void onBindViewHolder(@NonNull Appointment_Holder holder, int position) {

        Class_Appointment appointment = list_of_appointments.get(position);

        holder.tv_appointment_date.setText(appointment.getAppointment_date());
        holder.tv_appointment_end.setText(appointment.getAppointment_end());
        holder.tv_appointment_kaptin1_name.setText(appointment.getAppointment_kaptin1_name());
        holder.tv_appointment_kaptin2_name.setText(appointment.getAppointment_kaptin2_name());
        holder.tv_appointment_location.setText(appointment.getAppointment_location());
        holder.tv_appointment_num_of_players.setText(appointment.getAppointment_num_of_players());
        holder.tv_appointment_stadium_name.setText(appointment.getAppointment_stadium_name());
        holder.tv_appointment_start.setText(appointment.getAppointment_start());
        //holder.iv_Kaptin1_image.set
        //holder.iv_Kaptin2_image.set
        //holder.iv_stadium_image.set

    }

    @Override
    public int getItemCount() {
        return list_of_appointments.size();
    }
}
