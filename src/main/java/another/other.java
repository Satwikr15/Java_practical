package another;

public class other {
    public int a=13;
    public String b="india";
    public void action(){
        System.out.println("I'm in action mode ! ");
    }
    public String name;
    public other(String name){
        this.name=name;
    }
    public static class subclass{
        public void display(){
            System.out.println("I'm in subclass");
        }
    }
}
