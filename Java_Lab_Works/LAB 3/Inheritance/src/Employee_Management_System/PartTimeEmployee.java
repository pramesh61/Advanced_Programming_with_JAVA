class PartTimeEmployee extends Employee {
    PartTimeEmployee(String name, int rate) {
        super(name, rate);
    }

    @Override
    int calculateSalary() {
        return rate * 20;
    }
}

