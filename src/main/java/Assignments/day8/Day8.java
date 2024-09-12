package Assignments.day8;

public class Day8 {
    public static void main(String[] args) {
        //1
//        char letter='A';
//        while(letter <='E'){
//            if(letter == 'D') {
//                letter++;
//                continue;
//            }
//            System.out.print(letter);
//            letter++;
//        }

        //2
//        for(int i=1;i<25;i++){
//            i+=1;
//            System.out.println(i);
//        }

        //3
//        for(int i=1;i<=10;i++){
//            if(i==4 || i==5 || i==6)
//                continue;
//            System.out.println(i);
//        }

        //4
//        int level = 3;
//        switch (level){
//            case 1:
//                System.out.println("Beginner");
//                break;
//            case 2:
//                System.out.println("Intermediate");
//                break;
//            case 3:
//                System.out.println("Advanced");
//                break;
//            default:
//                System.out.println("nope");
//        }

        //5
        String month = "May";
        switch (month) {
            case "May":
            case "April":
            case "March":
            case "June":
                System.out.println("Summer");
                break;
            case "July":
            case "August":
            case "Sept":
            case "Oct":
                System.out.println("monsoon");
                break;
            case "Nov":
            case "Dec":
            case "Jan":
            case "Feb":
                System.out.println("winter");
                break;
            default:
                System.out.println("nope");

        }
    }
}
