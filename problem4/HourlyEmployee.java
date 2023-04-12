package problem4;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;
    public HourlyEmployee(String firstName, String lastName,
                              String socialSecurityNumber, double wage, double hours){
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;

    }
    @Override
    public double getPayment() {
        return wage*hours;
    }
    @Override
    public String toString(){
        String s = "Name: " + super.getFirstName() + " " + super.getLastName()+
                "\nSocial Security Number: " + super.getSocialSecurityNumber() +
                 "\nWage: " + getWage() + " \nHours: " + getHours();
        return s;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
