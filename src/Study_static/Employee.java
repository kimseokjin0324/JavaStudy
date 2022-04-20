package Study_static;

public class Employee {

    public static int serialNum = 1000;     //-static변수 선언

    private int employeeId;     //-아이디
    private String employeeName; //-이름
    private String department;  //-부서

    public Employee() {

        serialNum++;
        employeeId = serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
