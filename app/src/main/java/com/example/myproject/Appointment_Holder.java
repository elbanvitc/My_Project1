package com.example.myproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Appointment_Holder extends RecyclerView.ViewHolder {
    TextView tv_appointment_date,tv_appointment_start,tv_appointment_end,tv_appointment_num_of_players,tv_appointment_location,
            tv_appointment_stadium_name , tv_appointment_kaptin1_name ,tv_appointment_kaptin2_name;
    ImageView iv_Kaptin1_image ,iv_Kaptin2_image ,iv_stadium_image;
    public Appointment_Holder(@NonNull View itemView) {
        super(itemView);
        tv_appointment_date = itemView.findViewById(R.id.appointment_layout_tv_date_of_appointment);
        tv_appointment_start = itemView.findViewById(R.id.appointment_layout_tv_start_of_appointment);
        tv_appointment_end = itemView.findViewById(R.id.appointment_layout_tv_end_of_appointment);
        tv_appointment_num_of_players = itemView.findViewById(R.id.appointment_layout_tv_num_of_players_of_appointment);
        tv_appointment_location = itemView.findViewById(R.id.appointment_layout_tv_stadium_location);
        tv_appointment_stadium_name = itemView.findViewById(R.id.appointment_layout_tv_stadium_name);
        tv_appointment_kaptin1_name = itemView.findViewById(R.id.appointment_layout_tv_capten1_name);
        tv_appointment_kaptin2_name = itemView.findViewById(R.id.appointment_layout_tv_capten2_name);
        iv_Kaptin1_image = itemView.findViewById(R.id.appointment_layout_iv_capten1);
        iv_Kaptin2_image = itemView.findViewById(R.id.appointment_layout_iv_capten2);
        iv_stadium_image = itemView.findViewById(R.id.appointment_layout_iv_stadium);
    }
}
