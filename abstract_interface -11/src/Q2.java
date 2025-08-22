class Foundationpen extends pen{
    void write(){
        System.out.println("write abstraction");
    }

    void refill(){
        System.out.println("refill abstraction");
    }

    public void newq(){
        System.out.println("im an additional method in abstract class");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Foundationpen obj = new Foundationpen();
        obj.write();
        obj.refill();
        obj.newq();
    }
}
