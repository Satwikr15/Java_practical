package Assignments.day3;

public class casting {
    String s="999";
    int v=Integer.parseInt(s);
    //1
    public static void main(String[] args) {
     //1
        casting c=new casting();
        System.out.println(c.v);
        //System.out.println(c.s);
       System.out.println(" ");

       //2
        Plane p=new Plane();
        Plane p1 = p;
        p1.haveEngine();
        p.haveWheels();
        p.fly();


        System.out.println(" ");//4
        p.haveEngine();

    }
}
