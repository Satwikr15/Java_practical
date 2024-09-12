package Assignments.day9;

import java.util.*;

public class Day9 {
    public static void main(String[] args) {
        //1
//        int[] arr={1,2,3,4,5,6};
//        for(int i : arr)
//            System.out.println(i);

        //2
//        String[] arr={"you","zhall","not","pass"};
//        for(String i:arr)
//            System.out.println(i);
//        List<String> list = new ArrayList<>(Arrays.asList(arr));
//        Collections.sort(list);
//        System.out.println(" ");
//        for (String i : list) {
//            System.out.println(i);
//        }

        //3
//        char[] arr={'q','w','e'};
//        char[] arr1={'a','b','c'};
//        int[] sumArr = new int[arr1.length];
//
//        for (int i = 0; i < arr1.length; i++) {
//            sumArr[i] = arr[i] + arr1[i];
//        }
//        for(int j=0;j<=sumArr.length;j++)
//            System.out.println(sumArr[j]);

        //5
        int[][] arr=new int[3][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[2][0] = 5;
        arr[2][1] = 6;


        System.out.println("2D Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}
