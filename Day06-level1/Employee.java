public class Employee {
    String employeeName;
    int id;
    int salary;
    Employee(String employeeName, int id,int salary){
    this.employeeName=employeeName;
    this.id=id;
    this.salary=salary;
    }
    public static void displayDetails(){
        System.out.println(this.employeeName);
        System.out.println(this.id);
        System.out.println(this.salary);
    }
}
public static class Main{
    public static void main(String[] args) {
        Employee e1=new Employee("Shamiksha,103,750000");
        e1.displayDetails();
        
    }
    
}

