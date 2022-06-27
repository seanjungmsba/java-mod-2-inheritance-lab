import java.util.ArrayList;

public class EmployeeRunner {
  
    public static void main(String[] args) {
    
        // Create an ArrayList of Employee named a
        ArrayList<Employee> a = new ArrayList<>();
        
        a.add(new Employee("Doug", 56000));
        a.add(new Employee("Jim", 120000));
        a.add(new Manager("Bob", 180000, 25000));
        a.add(new Manager("Shirly", 220000, 40000));
        a.add(new Executive("Elon", 1500000, 0, 500000000));
        a.add(new Executive("Richard", 40000000, 0, 25000000));
        
        // enhanced for loop to iterate through the ArrayList
        System.out.println("Total Compensations for each employee: ");  
        for (Employee e: a) {
            System.out.println(e);  
            // System.out.println(e.getCompensation());
        }    
  }
}