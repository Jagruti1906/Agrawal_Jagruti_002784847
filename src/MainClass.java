
import java.util.ArrayList;
import java.util.Date;

public class MainClass {
    ArrayList<Employee> employeeList = new ArrayList<Employee>();
    public static void update(int empId, ArrayList<Employee> employeeList, Employee employee) {
        for(int i=0; i<employeeList.size(); i++) {
            if(employeeList.get(i).getEmployeeId() == empId) {
                employeeList.set(i, employee);
            }
        }
    }
    
    public static void remove(int empId, ArrayList<Employee> employeeList) {
        for(int i=0; i<employeeList.size(); i++) {
            if(employeeList.get(i).getEmployeeId() == empId) {
                employeeList.remove(i);
            }
        }
    }
    
    public static Employee search(ArrayList<Employee> employeeList, int empId) {
        for(int i=0; i<employeeList.size(); i++) {
            if(employeeList.get(i).getEmployeeId() == empId) {
                return employeeList.get(i);
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        HomePage home = new HomePage();
        employeeList.add(new Employee("Jagruti",1,22,"Female",new Date(),1,"Project Team","Manager","8557845654","jagruti1906@gmail.com"));
        update(1, employeeList, new Employee("Jagruti Agrawal",1,22,"Female",new Date(),1,"Project Team","Manager","8557845654","jagruti1906@gmail.com"));
//        System.out.println(employeeList.get(0).getName());
//        remove(1, employeeList);
//        System.out.println(employeeList.get(0).getName());
        try {
            System.out.print(search(employeeList,1).getName());
        }
        catch(Exception e) {
            System.out.print("Not Found");
        }
    }
    
}
