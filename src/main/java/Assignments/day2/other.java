package Assignments.day2;

public class other {
    private String name="Vikram";
    private int rollno=14;
    String state="TS";//default variable

//    public other(String name, int rollno, String state) {
//        this.name = name;
//        this.rollno = rollno;
//        this.state = state;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public other() {
    }
    private void showoff(){
        System.out.println(name+":"+rollno+":"+state);
    }
    void showstate(){
        System.out.println(state);
    }
    public void details(){
      showoff();
    }

    //3
    public String nam="kohli";
    public void about(){
        System.out.println("I'm kohli !!");
    }

    //4
    public other(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println(name);
    }
}
