package com.josh;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pet {
    private String name;
    private String type;
    private String address;
    private int visits;
    private ArrayList days;
    private String outputData;







    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    public int getVisits() {
        return visits;
    }
    public void setVisits(int visits) {
        this.visits = visits;
    }


    public ArrayList getDays() {
        return days;
    }
    public void setDays(ArrayList days) {
        this.days = days;
    }

    public String getOutputData() {
        return outputData;
    }
    public void setOutputData(String outputData) {
        this.outputData = outputData;
    }


    //Constructor
    public Pet(String petName, String petType, String petAddress, int petVisits) {
            this.name = petName;
            this.type = petType;
            this.address = petAddress;
            this.visits = petVisits;
            this.days = new ArrayList<String>();
            //this.outputData = dateOutputData;
        }

    public void addDays(String daysOfWeek){
        days.add(daysOfWeek);}

        public void output() {
            /*ArrayList<String> dayList = new ArrayList<>();
            if (days.contains("Monday")) {
                String outputData = ("Visit " + this.name + " " + visits + " time(s).  Address: " + address);
                dayList.add(outputData);
            }*/

            if (days.contains("Monday")) {
                System.out.println("Monday: ");
                System.out.println("Visit " + this.name + " " + visits + " time(s).  Address: " + address);
            }
            if (days.contains("Tuesday")) {
                System.out.println("Tuesday: ");
                System.out.println("Visit " + this.name + " " + visits + " time(s).  Address: " + address);
            }
            if (days.contains("Wednesday")) {
                System.out.println("Wednesday: ");
                System.out.println("Visit " + this.name + " " + visits + " time(s).  Address: " + address);
            }
            if (days.contains("Thursday")) {
                System.out.println("Thursday: ");
                System.out.println("Visit " + this.name + " " + visits + " time(s).  Address: " + address);
            }
            if (days.contains("Friday")) {
                System.out.println("Friday: ");
                System.out.println("Visit " + this.name + " " + visits + " time(s).  Address: " + address);
            }
        }
    }



