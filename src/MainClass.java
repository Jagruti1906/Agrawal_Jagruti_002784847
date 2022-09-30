
import java.util.ArrayList;
import java.util.Date;

public class MainClass {
    static ArrayList<Employee> employeeList = new ArrayList<Employee>();
    public static void update(int empId, Employee employee) {
        for(int i=0; i<employeeList.size(); i++) {
            if(employeeList.get(i).getEmployeeId() == empId) {
                employeeList.set(i, employee);
            }
        }
    }
     
    public static void remove(int empId) {
        for(int i=0; i<employeeList.size(); i++) {
            if(employeeList.get(i).getEmployeeId() == empId) {
                employeeList.remove(i);
            }
        }
    }
    
    public static Employee search(int empId) {
        for(int i=0; i<employeeList.size(); i++) {
            if(employeeList.get(i).getEmployeeId() == empId) {
                return employeeList.get(i);
            }
        }
        return null;
    }
    
    public static void addEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println(employeeList.size());
    }
    
    public static void main(String[] args) {
        try {
            HomePage home = new HomePage();
        }
        catch(Exception e) {  
            System.out.print("Not Found");
        }
    }
    
}
