
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
    
    public String getName() {
        return name;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getGender() {
        return gender;
    }
    
    public Date getStartDate() {
        return startDate;
    }
    
    public int getLevel() {
        return level;
    }
    
    public String getTeamInfo() {
        return teamInfo;
    }
    
    public String getPositionTitle() {
        return positionTitle;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    
    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }
    
    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
