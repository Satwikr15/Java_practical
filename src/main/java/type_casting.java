public class type_casting {
    public static void main(String[] args){
        int a=12;
        String b="12";
        int c=Integer.parseInt(b);
        int d=Integer.valueOf(b);
        System.out.println(c);
        System.out.println(b);
        System.out.println(d);
        // "==" --> compare the memory location
        // "equals(" ")" --> compare the actual value
    }
}
