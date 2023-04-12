package problem4;

public class CommissionEmployee extends Employee{
    private double grossSale;
    private double commissionRate;
    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNumber, double grossSale, double commissionRate){
        super(firstName, lastName, socialSecurityNumber);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;

    }
    @Override
    public double getPayment() {
        return grossSale*commissionRate;
    }
    @Override
    public String toString(){
        String s = "Name: " + super.getFirstName() + " " + super.getLastName()+
                "\nSocial Security Number: " + super.getSocialSecurityNumber() +
                "\nGross Sale: " + getGrossSale() + " \nCommission Rate: " + getCommissionRate();
        return s;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
