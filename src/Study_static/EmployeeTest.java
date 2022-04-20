package Study_static;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setEmployeeName("이순신");

        System.out.println(employee.serialNum);

        Employee employee1 = new Employee();
        employee1.setEmployeeName("김좌진");

        System.out.println(employee.getEmployeeName()+"님의 사번은 :" +employee.getEmployeeId() +"입니다");
        System.out.println(employee1.getEmployeeName()+"님의 사번은 :" +employee1.getEmployeeId() +"입니다");
    }
}
