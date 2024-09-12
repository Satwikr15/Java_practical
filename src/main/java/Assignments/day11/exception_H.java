package Assignments.day11;

public class exception_H {
    public static void main(String[] args) {
        //1
//        try{
//            String str="India";
//            System.out.println(str.charAt(10));
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        //2
//        try{
//            String[] animals={"Dog","cat","horse","goat"};
//            System.out.println(animals[5]);
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            System.out.println("This should print with or without exception");
//        }

        //3
//        try{
//            String name= "sachin"; //sachin,blank
//            String price="999";  //blank,null,999
//            System.out.println("Length of name is:"+name);
//            System.out.println("Product price: "+Integer.parseInt(price));
//        } catch (NumberFormatException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            System.out.println("This should print with or without exception");
//       }

        //4
        try{
        other o=new other();
        o.waitandprint();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
