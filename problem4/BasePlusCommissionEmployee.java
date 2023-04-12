package problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName,
                            String socialSecurityNumber, double grossSale, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate );
        this.baseSalary = baseSalary;

    }
    @Override
    public double getPayment() {
        return baseSalary + (super.getGrossSale()*super.getCommissionRate()) ;
    }
    @Override
    public String toString(){
        String s = "Name: " + super.getFirstName() + " " + super.getLastName()+
                "\nSocial Security Number: " + super.getSocialSecurityNumber() +
                "\nBase Salary: " + getBaseSalary() + "\nGross Sale: " + super.getGrossSale() + " \nCommission Rate: " + super.getCommissionRate();
        return s;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
