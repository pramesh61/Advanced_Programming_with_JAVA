package objectorientedprinciples.polymorphism;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.func();
        p.func(10);
        
        Child c = new Child();
        c.func();
        c.func(20);
    }
}
