

public class Constructor {

    String name;
    int rank;

    public Constructor() {

        System.out.println("Constructor Called !!!");

    }

    public Constructor(String name, int rank) {
        this.name = name;
        this.rank = rank;

    }

     public static void main(String[] args) {
        
    }void display() {

        System.out.println("Welcome" + name + "Your rank is" + rank);

    }

        public static void main() {
        Constructor c1 = new Constructor();
        c1.display();
        Constructor c2 = new Constructor("Pramesh", 1);
        c2.display();
        }
    }
