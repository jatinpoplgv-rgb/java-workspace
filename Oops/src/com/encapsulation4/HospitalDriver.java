package com.encapsulation4;



public class HospitalDriver
{
    public static void main(String[] args)
    {
        HospitalApointment user1 = new HospitalApointment("jatin", "rfgf85", 22, 510);
        HospitalApointment user2 = new HospitalApointment("abhay", "rfg52", -10, 250);

        if (user1.setAppointment(600))
        {
            System.out.println("Pateint name : " + user1.getpateintName());
            System.out.println("Pateint id   : " + user1.getpateintId());
            System.out.println("Pateint age  : " + user1.getage());
            System.out.println("Fee          : " + user1.getfee());
        }

        System.out.println("-----------------");

        if (user2.setAppointment(250))
        {
            System.out.println("Pateint name : " + user2.getpateintName());
            System.out.println("Pateint id   : " + user2.getpateintId());
            System.out.println("Pateint age  : " + user2.getage());
            System.out.println("Fee          : " + user2.getfee());
        }
    }
}