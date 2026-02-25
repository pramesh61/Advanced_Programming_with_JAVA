class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, int rate) {
        super(name, rate);
    }

    @Override
    int calculateSalary() {
        return rate * 40;
    }
}
