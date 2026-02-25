final public class Immutable {


    final String name;

    Immutable(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    // public void setName(String name){
    //     this.name=name;
    // }

    public static void main(String[] args) {
        Immutable i1=new Immutable("Pramesh");

        System.out.println(i1.getName());

        // i1.setName("God");
        // System.out.println(i1.getName());

        
    }

    
}