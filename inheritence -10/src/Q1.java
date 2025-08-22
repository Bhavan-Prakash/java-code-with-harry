class circle{
    public void check(){
        System.out.println("im circle method");
    }
}

class cylinder extends circle{
    public void check1(){
        System.out.println("im a cylinder method");
    }
}

public class Q1 {
    public static void main(String[] args) {
        cylinder obj = new cylinder();
        obj.check();
        obj.check1();
    }
}
