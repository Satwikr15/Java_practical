package private_modifier;

import java.security.PublicKey;

public class private_ {

    private int a=0;
    private String b="indian";

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void getB() {
        display();
    }

    public void setB(String b) {
        this.b = b;
    }
    public void display(){
        System.out.println("details are:- "+a +" and "+ b);
    }
    public static void main(String[] args){
        private_ p = new private_();
        p.display();
        p.setB("hi");
        p.getB();
        p.display();
    }
}
