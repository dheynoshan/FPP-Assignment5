package problem2;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
    private int numOfPublications;
    public Professor(String name, double salary, LocalDate hireDay){
        super(name, salary, hireDay);
    }

    public int getNumOfPublications() {
        return numOfPublications;
    }

    public void setNumOfPublications(int numOfPublications) {
        this.numOfPublications = numOfPublications;
    }

    @Override
    public String toString(){
        return "Name: " + super.getName() +"\nSalary: " + super.computeSalary() +
                "\nHire Day: " + getHireDay().toString() + "\nNumber of publications: " + numOfPublications;
    }
}
