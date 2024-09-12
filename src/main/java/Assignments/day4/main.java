package Assignments.day4;

public  class main {
    public static void main(String[] args) {
        RBI hdfc=new HDFC();
        RBI icici=new ICICI();

        hdfc.opensavingsAccounts();
        icici.opensavingsAccounts();

        System.out.println(hdfc.interestRate());
        System.out.println(hdfc.annualCharge());

        System.out.println(icici.interestRate());
        System.out.println(icici.annualCharge());

        System.out.println(" ");
        //2
        circle c=new circle(4,5);
        System.out.println(c.findArea());
        square s=new square(4);
        System.out.println(s.findArea());
        System.out.println(" ");
        //3
        main m=new main();
        int age1 = m.age;
        m.setAge(19);
        if(m.getAge()<18)
            System.out.println("the person is minor");
    }
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
