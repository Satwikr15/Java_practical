package Assignments.day5;

public class Employee {
    public int empId;

    public String empName;

    public static String companyName;

    public Employee(int empId, String empName, String google) {
        this.empId = empId;
        this.empName = empName;
    }

    public Employee() {
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    public int getEmpId() {
        return this.empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void changecompanyname(String name){
        setCompanyName(name);
        //System.out.println(getCompanyName());
    }
    public void details(){
        System.out.println(getEmpId());
        System.out.println(getEmpName());
        System.out.println(getCompanyName());
    }
}
