package problem4;

public class SalariedEmployee extends Employee{
    private double weeklySalary;
    public SalariedEmployee(String firstName, String lastName,
                          String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;

    }
    @Override
    public double getPayment() {
        return weeklySalary;
    }
    @Override
    public String toString(){
        String s = "Name: " + super.getFirstName() + " " + super.getLastName()+
                "\nSocial Security Number: " + super.getSocialSecurityNumber() +
                "\nWeekly Salary: " + getWeeklySalary() ;
        return s;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}
