package Assignments.day2;



//2.Create a class with default variable and method and try to access them from another class from another package
//3.Create a class with public variable and method and try to access them from another class from another package
//4.Create a class and initialize an string instance variable in constructor.
//          Add a method to print a variable value.
//          create another class with main method and
//          call that method
//5.Write a program to compare 2 string variables "India" and "IndiA" with .equals method in class
public class accessmodifier {

    public static void main(String[] args) {
        //1
        other o=new other();
        o.details();
        //2
        o.showstate();
      String s= o.state;
      System.out.println(s);//default(2)
        //3
        System.out.println(o.nam);
        o.about();
        //4
        o.setName("satwik");
        o.print();

        //5
        String var1="India";
        String var2="IndiA";
        System.out.println(var1.equals(var2));

        //6
        String sentence="Sky is the limit!";
        System.out.println(sentence.charAt(5));

        //7
        System.out.println(sentence.toUpperCase());

        //8
        System.out.println(sentence.length());

        //9
        System.out.println("9:"+var1.equalsIgnoreCase(var2));

        //10
        System.out.println(22%5);
    }
}
