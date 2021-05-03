package com.example.myproject;
import android.graphics.Bitmap;

import java.io.Serializable;
public class Class_Appointment implements Serializable {
  private   String  staduim_image ,Kaptin1_image ,_Kaptin2_image;
  private   String appointment_date,appointment_start,appointment_end,appointment_num_of_players,
                   appointment_location,appointment_stadium_name , appointment_kaptin1_name ,appointment_kaptin2_name;

  // constractor for primary make appointment
  public Class_Appointment(String appointment_date, String appointment_start, String appointment_end,
                           String appointment_num_of_players,
                           String appointment_location,
                           String appointment_stadium_name, String appointment_kaptin1_name, String appointment_kaptin2_name)
  {

    this.appointment_date = appointment_date;
    this.appointment_start = appointment_start;
    this.appointment_end = appointment_end;
    this.appointment_num_of_players = appointment_num_of_players;
    this.appointment_location = appointment_location;
    this.appointment_stadium_name = appointment_stadium_name;
    this.appointment_kaptin1_name = appointment_kaptin1_name;
    this.appointment_kaptin2_name = appointment_kaptin2_name;
  }

  // getter and setter for all
  public String getStaduim_image(){
    return staduim_image;
  }
  public void setStaduim_image(String staduim_image)  {
    this.staduim_image = staduim_image;
  }
  public String getKaptin1_image() {
    return Kaptin1_image;
  }
  public void setKaptin1_image(String kaptin1_image) {
    Kaptin1_image = kaptin1_image;
  }
  public String get_Kaptin2_image() {
    return _Kaptin2_image;
  }
  public void set_Kaptin2_image(String _Kaptin2_image) {
    this._Kaptin2_image = _Kaptin2_image;
  }
  public String getAppointment_date() {
    return appointment_date;
  }
  public void setAppointment_date(String appointment_date) {
    this.appointment_date = appointment_date;
  }
  public String getAppointment_start() {
    return appointment_start;
  }
  public void setAppointment_start(String appointment_start) {
    this.appointment_start = appointment_start;
  }
  public String getAppointment_end() {
    return appointment_end;
  }
  public void setAppointment_end(String appointment_end) {
    this.appointment_end = appointment_end;
  }
  public String getAppointment_num_of_players() {
    return appointment_num_of_players;
  }
  public void setAppointment_num_of_players(String appointment_num_of_players) {
    this.appointment_num_of_players = appointment_num_of_players;
  }
  public String getAppointment_location() {
    return appointment_location;
  }
  public void setAppointment_location(String appointment_location) {
    this.appointment_location = appointment_location;
  }
  public String getAppointment_stadium_name() {
    return appointment_stadium_name;
  }
  public void setAppointment_stadium_name(String appointment_stadium_name) {
    this.appointment_stadium_name = appointment_stadium_name;
  }
  public String getAppointment_kaptin1_name() {
    return appointment_kaptin1_name;
  }
  public void setAppointment_kaptin1_name(String appointment_kaptin1_name) {
    this.appointment_kaptin1_name = appointment_kaptin1_name;
  }
  public String getAppointment_kaptin2_name() {
    return appointment_kaptin2_name;
  }
  public void setAppointment_kaptin2_name(String appointment_kaptin2_name) {
    this.appointment_kaptin2_name = appointment_kaptin2_name;
  }
}
