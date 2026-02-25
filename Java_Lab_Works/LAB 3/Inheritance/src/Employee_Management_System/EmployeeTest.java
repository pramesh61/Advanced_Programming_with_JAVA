public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Ram", 500);
        Employee e2 = new PartTimeEmployee("Sita", 300);

        System.out.println("Full-Time Salary: " + e1.calculateSalary());
        System.out.println("Part-Time Salary: " + e2.calculateSalary());
    }
}
