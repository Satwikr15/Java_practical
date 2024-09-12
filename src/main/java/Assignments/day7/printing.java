package Assignments.day7;

public class printing {
    public static void main(String[] args) {
//        int i=0;
//        while(i<=20){
//            System.out.println(i);
//            i+=2;
//        }

        //2
//        int i=25;
//        do {
//            System.out.println(i);
//            i-=2;
//        }while(i>=1);

        //3
//        int i=1,t=0;
//        while(i<=10){
//            t=t+i;
//            i++;
//        }
//        System.out.println(t);

        //5
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
