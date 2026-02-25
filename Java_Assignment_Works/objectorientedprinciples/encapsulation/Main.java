package objectorientedprinciples.encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        
        // Using setters
        emp.setId(23);
        emp.setName("Pramesh Lamichhane");

        // Using getters
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
    }
}
