class overloading{
    public overloading(){
        System.out.println("lenth is 4 and breadth is 5");
    }

    public overloading(int l){
        System.out.println("passing only l");
        System.out.println("breadth is 5");
        System.out.println("length is " + l);
    }

    public overloading(int b,int l){
        System.out.println("passing both l and b");

        System.out.println("length is " + l);
        System.out.println("breadth is " + b);

    }
}

public class Q4 {
    public static void main(String[] args) {
        overloading cla = new overloading();
        overloading cla1 = new overloading(4);
        overloading cla2 = new overloading(4,5);

    }
}
