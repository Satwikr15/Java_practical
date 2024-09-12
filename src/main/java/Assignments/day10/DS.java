package Assignments.day10;

import java.util.ArrayList;
import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;

//Create a LinkedList and add few String values (“India”, “USA”, “Australia”, “UK”, “Germany”).
// Update the value at index 1 (“Russia”). Use for loop to iterate through the list.
public class DS {
    public static void main(String[] args) {
        //1
//        int LLsize=5;
//        LinkedList<String> LL=new LinkedList<>();
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<LLsize;i++){
//            LL.add(i, sc.nextLine());
//        }
//        for(String j: LL){
//            System.out.println(j);
//        }
//        LL.set(1,"Russia");
//        System.out.println("after updating");
//        for(String j: LL){
//            System.out.println(j);
//        }

        //2.Create an ArrayList and add Integer values (201, 155, 325, 72, 66).
        // Find the index of 325 value. Remove member at index 1.
        // Use iterator and iterate through list.
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> arr= new ArrayList<>();
//        int len=5;
//        for(int i=0;i<len;i++){
//            arr.add(i,sc.nextInt());
//        }
//        for(int j: arr){
//            System.out.println(j);
//        }
//        int location=arr.indexOf(3);
//        System.out.println(location);
//        arr.remove(1);
//        for(int j: arr){
//            System.out.println(j);
//        }
//
//        Iterator iterator= arr.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //3Create a LinkedList and add few Character values (‘U’, ‘E’, ‘I’, ‘A’, ‘O’). Check if the list is empty or not.
        // Use list iterator and iterate through list in the reverse order. Clear the list and check the size of the list.
        LinkedList<Character> l=new LinkedList<>();
        l.add('U');
        l.add('E');
        l.add('I');
        l.add('A');
        l.add('O');
        if(l.isEmpty())
            System.out.println("list is empty");

        ListIterator iterator= l.listIterator(l.size());
        while (iterator.hasPrevious())
            System.out.println(iterator.previous());
    }
}
