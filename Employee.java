package javaBasic.Task10;

public class Employee {
    
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    

public Employee(int id, String firstName, String lastName, int salary){
   this.id = id;
   this.firstName = firstName;
   this.lastName = lastName;
   this.salary = salary;

}
  //getter method
  public int getId(){
    return id;
  }
  public String getfirstName(){
    return firstName;
  }
  public String getlastName(){
    return lastName;
  }
  public int getSalary(){
    return salary;
  } 
  
public void raiseSalary(double percent){
    double increase = salary * (percent/100);
    salary += increase;
}
     public void printEmployeeDetails(){

        System.out.println("Emp Id:" + id);
        System.out.println("Emp Name:" + firstName);
        System.out.println("Emp Last:" + lastName);
        System.out.println("Emp Salary:" + salary );
    }
     
    public static void main(String[] args) {
        Employee employee = new Employee(12, "Dhoni", "MS", 15000);
        System.out.println("Employee details: ");
        employee.printEmployeeDetails();
        System.out.println("\nAfter raising employee salary:" );
        employee.raiseSalary(5);
        employee.printEmployeeDetails();
        employee = new Employee(07, "jadu", "bhai", 50000);
        System.out.println("\nEmployee details: ");
        employee.printEmployeeDetails();
        System.out.println("\nAfter raising emp2 salary:" );
        employee.raiseSalary(4);
        employee.printEmployeeDetails();
    }


}

    



    