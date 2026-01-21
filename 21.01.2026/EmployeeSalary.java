
import java.util.Scanner;

// ENCAPSULATION 
class Employee {
    private String name;
    private float salary;

    public void setName(String name){
        this.name = name;
    } 
    public void setSalary(float salary){
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }
    public float getSalary(){
        return this.salary;
    }
}

public class EmployeeSalary {
    
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the name : ");
            String name = sc.nextLine();

            System.out.print("Enter the salary : ");
            float salary = sc.nextFloat();
            
            Employee emp = new Employee();
            emp.setName(name);
            emp.setSalary(salary);

            System.out.println("Name : "+emp.getName()+"\nSalary : "+emp.getSalary());
        }
        
        
    }
}
