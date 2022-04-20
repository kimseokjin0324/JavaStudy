package ExamSingletonPattern;

public class Company {

    private static Company instance = new Company();

    //-싱글톤패턴에서는 외부에서 이 객체를 new할수없도록 생성자를 private으로 제공함
    private Company() {

    }

    public static Company getInstance() {
        if (instance == null)
            instance = new Company();
        return instance;
    }

}
