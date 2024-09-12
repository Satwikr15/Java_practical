package Assignments.day4;

public class square implements Shape{
    int s;

    public square(int s) {
        this.s = s;
    }

    @Override
    public int findArea() {
        return s*s;
    }
}
