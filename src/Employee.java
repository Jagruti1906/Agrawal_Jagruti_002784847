
import java.util.Date;

public class Employee {
    private String name;
    private int employeeId;
    private int age;
    private String gender;
    private Date startDate;
    private int level;
    private String teamInfo;
    private String positionTitle;
    private String phoneNumber;
    private String email;
    
    Employee(String name, int employeeId, int age, String gender, Date startDate, int level, String teamInfo, String positionTitle, String phoneNumber, String email) {
        this.name = name;
        this.employeeId = employeeId;
        this.age = age;
        this.gender = gender;
        this.startDate = startDate;
        this.level = level;
        this.teamInfo = teamInfo;
        this.positionTitle = positionTitle;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
