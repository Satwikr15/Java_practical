package Assignments.day4;

public class circle implements Shape{
    int l,b;

    public circle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public int findArea() {
        return l*b;
    }
}
