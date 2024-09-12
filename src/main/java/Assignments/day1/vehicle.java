package Assignments.day1;

public class vehicle {
    public int numberofwheels=2;
    public boolean ispetrolengine=true;
    public String manufacturer="Hyundai";

    public vehicle(int numberofwheels, boolean ispetrolengine, String manufacturer) {
        this.numberofwheels = numberofwheels;
        this.ispetrolengine = ispetrolengine;
        this.manufacturer = manufacturer;
    }

    public void printdetails(){
        System.out.println("numberOfWheels:"+numberofwheels+", isPetrolEngine: "+ispetrolengine+" and manufacturer:"+manufacturer);
    }
}
