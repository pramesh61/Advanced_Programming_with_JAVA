abstract class Employee {
    protected String name;
    protected int rate;

    Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    abstract int calculateSalary();
}
