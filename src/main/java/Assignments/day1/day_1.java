package Assignments.day1;

//Write a java program in notepad to print “Hello World!” and compile and run it from command line
/*
* Write a java program for Vehicle class. It has below
* Variables:
* numberOfWheels (int)=2;
* isPetrolEngine (boolean)=true;
* manufacturer (String)=”Hyundai”;
* Methods: printDetails() {
* //print variables numberOfWheels,
* isPetrolEngine and manufacturer
* }
* Create another class with main method and call above method.
* */
public class day_1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        vehicle v=new vehicle(2,true,"MS");
        v.printdetails();
    }

}
