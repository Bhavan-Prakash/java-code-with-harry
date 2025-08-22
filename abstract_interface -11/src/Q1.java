abstract class pen{
    abstract void write();

    abstract void refill();
}

class main extends pen {
    void write(){
        System.out.println("write abstraction");
    }

    void refill(){
        System.out.println("refill abstraction");
    }
}


public class Q1 {
    public static void main(String[] args) {
        main obj = new main();
        obj.write();
        obj.refill();
    }
}