package InheritenceStudy;

public class VIPCustomer extends Customer {
    private int agentId;    //-담당 전문 상담원
    double salesRatio;

    public VIPCustomer() {
        customerGrade = "VIP";    //오류 발생
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public int getAgentID() {
        return agentId;
    }

}
