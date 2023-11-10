
import java.util.Scanner;
import java.util.HashSet;


public class EmployeeService {

    HashSet<Employee> empset = new HashSet<Employee>();

    Employee emp1 = new Employee(101, "Shital", 24, "Developer", "IT", 25000);
    Employee emp2 = new Employee(102, "Meena", 26, "Tester", "CO", 57000);
    Employee emp3 = new Employee(103, "Bob", 20, "DevOps Eng", "Admin", 5000);
    Employee emp4 = new Employee(104, "Max", 27, "System Eng", "CO", 70000);

    Scanner sc=new Scanner(System.in);
    boolean found=false;

    int id;
    String name;
    int age;
    String department;
    String desiganation;
    double salary;

    public EmployeeService() {
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
    }
    //view all emp
    public void viewAllEmps() {
        for (Employee emp:empset){
            System.out.println(emp);
        }
    }
    //view emp based on id
    public void viewEmp() {
        System.out.println("Enter id: ");
        id= sc.nextInt();
        for(Employee emp:empset){
            if(emp.getId()==id){
                System.out.println(emp);
                found=true;
            }
        }
        if(!found){
            System.out.println("Employee with this id is not present");
        }
    }
    //update employees
    public void updateEmployee() {
        System.out.println("Enter ID");
        id=sc.nextInt();
        boolean found=false;
        for (Employee emp:empset){
            if (emp.getId()==id){
                System.out.println("Enter name: ");
                name=sc.next();
                System.out.println("Enter new salary");
                double sal = sc.nextDouble();
                emp.setName(name);
                emp.setSalary(sal);
                System.out.println("Updated Details of Employee are: ");
                System.out.println(emp);
                found=true;
            }
        }
        if (!found){
            System.out.println("Employee is not present");
        }
        else {
            System.out.println("Employee details updated successfully !!");
        }
    }
    //delete the employee
    public void deleteEmp() {
        System.out.println("Enter ID");
        id=sc.nextInt();
        Employee empdelete=null;
        for (Employee emp:empset){
            if (emp.getId()==id){
                empdelete=emp;
                found=true;
            }

        }
        if (!found){
            System.out.println("Employee is not present");
        }
        else {
            empset.remove(empdelete);
            System.out.println("Employee Deleted Successfully");
        }
    }
    //add employee
    public void addEmp() {
        System.out.println("Enter ID: ");
        id=sc.nextInt();
        System.out.println("Name for the Employee: ");
        name= sc.next();
        System.out.println("Enter the Age: ");
        age=sc.nextInt();
        System.out.println("Enter Designation: ");
        desiganation=sc.next();
        System.out.println("Enter the department of the employee: ");
        department=sc.next();
        System.out.println("Enter the salary of the employee: ");
        salary=sc.nextDouble();

        Employee emp=new Employee(id,name, age, desiganation, department, salary);
        empset.add(emp);
        System.out.println(emp);
        System.out.println("Employee addedd sucessfully");

    }
}
