package Assignments.day3;

public class Plane extends vehicle{
    public void fly(){
        System.out.println("I can fly");
    }

    @Override
    public void haveEngine() {
        super.haveEngine();
    }
}
