package ExamSingletonPattern;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        //-싱글톤패턴의 사용
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);

        Calendar calendar = Calendar.getInstance();
    }
}
