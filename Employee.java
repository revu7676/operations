public class Employee {
    String name;
    int id;
    double salary;
    String phone_no;
    String branch;

    public Employee(String name, int id,double salary,String phone_no,String branch){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.phone_no=phone_no;
        this.branch=branch;
    }
    public void displayInfo(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("phone_no" + phone_no);
        System.out.println("branch: " + branch);
        

    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("XYZ", 101, 50000.0, "1234567899", "BCA");
        emp1.displayInfo();
    }
}
