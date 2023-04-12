package problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double sumOfSalary =0;
        DeptEmployee[] department = {
                new Professor("Prof1",10000, LocalDate.of(2020,1,1)),
                new Professor("Prof2", 11000, LocalDate.of(1997, 7, 5)),
                new Professor("Prof 3", 12000, LocalDate.of(1994, 2,7)),
                new Secretary("Sec1", 5000, LocalDate.of(1999, 7,2)),
                new Secretary("Sec2", 6000, LocalDate.of(1996, 5,3))
        };
        Professor prof1 = (Professor)department[0];
        prof1.setNumOfPublications(20);
        Professor prof2 = (Professor)department[1];
        prof2.setNumOfPublications(30);
        Professor prof3 = (Professor)department[2];
        prof3.setNumOfPublications(45);
        Secretary sec1 = (Secretary)department[3];
        sec1.setOvertimeHours(10);;
        Secretary sec2 = (Secretary)department[4];
        sec2.setOvertimeHours(14);;

        for (DeptEmployee de:department){
            System.out.println(de.toString());
            System.out.println("===================");
        }
        System.out.print("Do you wish to see the sum of salary (Y/N): ");
        String sel = sc.nextLine();
        sc.close();
        if(sel.equals("Y")){
            for (DeptEmployee de:department){
                sumOfSalary+=de.computeSalary();
            }
            System.out.println("Sum of salary is: " + sumOfSalary);
            System.out.println("===================");
        }
        else if(sel.equals("N")){
            System.out.println("Exiting");
        }
        else{
            System.out.println("Invalid Selection | Exiting");
        }
    }
}
