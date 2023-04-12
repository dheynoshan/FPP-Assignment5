package problem2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
    private double overtimeHours;
    public Secretary(String name, double salary, LocalDate hireDay){
        super(name, salary, hireDay);
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
    @Override
    public double computeSalary(){
        return super.computeSalary()+(12*overtimeHours);
    }
    @Override
    public String toString(){
        return "Name: " + super.getName() +"\nSalary: " + super.computeSalary() +
                "\nHire Day: " + getHireDay().toString() + "\nOvertime hours: " + overtimeHours;
    }
}
