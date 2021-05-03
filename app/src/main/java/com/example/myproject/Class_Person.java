package com.example.myproject;

import java.util.ArrayList;

public class Class_Person {
    private String name ,phone_num , birth_day ,user_name , password ,profil_image;
    private static String ID;
    private ArrayList<Class_Appointment> prs_appointments ;

    public Class_Person(String name, String phone_num, String birth_day, String user_name, String password, String ID, ArrayList<Class_Appointment> prs_appointments)
    {
        this.name = name;
        this.phone_num = phone_num;
        this.birth_day = birth_day;
        this.user_name = user_name;
        this.password = password;
        this.ID = ID;
        // the person has ID = 000*******
        this.prs_appointments = prs_appointments;
    }
    //    //  constractor for registartion
    public Class_Person(String name, String phone_num, String birth_day, String user_name,
                        String password,String profil_image) {
        this.name = name;
        this.phone_num = phone_num;
        this.birth_day = birth_day;
        this.user_name = user_name;
        this.password = password;
        this.profil_image = profil_image;
    }

                                         public ArrayList<Class_Person> getPlanedAppointment (String ID) {
        //  we will retern only the appointments which had been created and accebted from the stadium ,and dosn't started yet
        // the planed appointment has ID = 110*******
        // the finished appointment has ID = 111*******
        // the offerded appointment has ID = 120*******
        // the refused appointment has ID = 100*******
        return null;
    }
                                         public void addPrs_appointment(Class_Appointment prs_appointment) {
                                             prs_appointments.add(prs_appointment); }
                                         public Class_Person find_person_by_ID (String ID){
                                         return this;
                                         }

    public String getName() {
        return name;
    }       public void setName(String name) {
        this.name = name;
    }
    public String getPhone_num() {
        return phone_num;
    }             public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }
    public String getBirth_day() {
        return birth_day;
    }             public void setBirth_day(String birth_day) {
        this.birth_day = birth_day;
    }
    public String getUser_name() {
        return user_name;
    }             public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getPassword() {

        return password;
    }              public void setPassword(String password) {
        this.password = password;
    }
    public String getID() {
        return ID;
    }           public void setId(String ID) {
        this.ID = ID;
    }
    public ArrayList<Class_Appointment> getPrs_appointment() {

        return prs_appointments;
    }    public void setPrs_appointments(ArrayList<Class_Appointment> prs_appointments) {
        this.prs_appointments = prs_appointments;
    }


}
