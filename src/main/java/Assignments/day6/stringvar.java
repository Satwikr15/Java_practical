package Assignments.day6;

public class stringvar {
//1
//    public static void main(String[] args) {
//        String var=" ";
//        if (var.length() !=0)
//            System.out.println(var);
//
//    }

    //2
//    public static void main(String[] args) {
//        int v=0;
//        if (v>0)
//            System.out.println("positive");
//        else if (v<0) {
//            System.out.println("negative");
//        }
//        System.out.println("0");
//    }

    //3.Write a program to print a string variable value, only if it is no null or blank.
    // If the string is shorter than 10 characters, print the string is short. If the string is greater than 10 characters,
    // print the string is long
//        public static void main(String[] args) {
//        String var="qwertyu ";
//        if (var.length() < 10)
//            System.out.println(var);
//        else
//            System.out.println("Long");
//    }

    //4.Write a program to print grades based on totalMarks obtained.
    //
    //Less than 50: Fail
    //
    //Between 50 to 60: D Grade
    //
    //Between 60 to 70: C Grade
    //
    //Between 70 to 80: B Grade
    //
    //Between 80 to 90: A Grade
    //
    //Between 90 to 100: A+ Grade
    //
    //Above 100: Invalid marks
    public static void main(String[] args) {
        int score=80;
        if(score >= 90 && score <= 100)
            System.out.println("A+ Grade");
        else if (score >=  80&&score < 90) {
            System.out.println("A Grade");
        }
        else if (score >= 70 &&score < 80) {
            System.out.println("B Grade");
        }
        else if (score >= 60 &&score < 70) {
            System.out.println("C Grade");
        }
        else if (score >= 50 &&score < 60) {
            System.out.println("D Grade");
        }
        else
            System.out.println("Ur failed !!!!");
    }
}
