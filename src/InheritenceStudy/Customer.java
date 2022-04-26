package InheritenceStudy;

public class Customer {

    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    //-일반고객의 경우 물품 구매시 1% 보너스 포인트 적립
    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calPrice(int price) {
        bonusPoint += price * bonusPoint;
        return bonusPoint;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade +
                "이며, 보너스 포인트는" + bonusPoint + "입니다";

    }

}
