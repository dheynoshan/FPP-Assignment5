package problem4;

public class Driver {
    public static void main(String[] args) {
        Employee[] emp = {
                new CommissionEmployee("Emp1", "Test1", "emp12345",20000, 0.05),
                new HourlyEmployee("Emp2", "Test2", "emp23456",35, 40),
                new SalariedEmployee("Emp3", "Test3", "emp34567",1200),
                new BasePlusCommissionEmployee("Emp4", "Test4", "emp45678", 15000, 0.04, 1200)
        };
        for (Employee em : emp) {
            System.out.println(em.toString());
            System.out.println("================");
        }
        System.out.print("Total salary: ");
        double salary = 0;
        for (Employee em : emp) {
            salary=salary+em.getPayment();
        }
        System.out.print(salary);
    }
}
