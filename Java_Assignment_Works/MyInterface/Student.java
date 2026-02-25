class Student implements MyInterface {
    String name;
    int age;

    @Override
    public void insertData() {
        name = "Pramesh Lamichhane";
        age = 21;
    }

    @Override
    public void displayInformation() {
        System.out.println ("Name: " + name);
        System.out.println ("Age: " + age);
    }
}



