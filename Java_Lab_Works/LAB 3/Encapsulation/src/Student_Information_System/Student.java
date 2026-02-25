public class Student {

    String name;
    int roll;
    float marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void display() {
        System.out.println(name + "  "+ roll +"  "+ marks);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setMarks(100);
        s1.setName("Pramesh");
        s1.setRoll(23);
        s1.display();

    }
}