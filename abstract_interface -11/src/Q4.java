abstract class telephone{
    abstract void ring();

    abstract void lift();

    abstract void disconnect();


}

class smarttelephone extends telephone{
    public void ring(){
        System.out.println("im ring method");
    }

    public void lift(){
        System.out.println("im lift method");
    }

    public void disconnect(){
        System.out.println("im disconnect method");
    }
}


public class Q4 {
    public static void main(String[] args) {
        telephone obj = new smarttelephone(); //polymorphism
//        smarttelephone obj = new smarttelephone(); //simple not a polymorphism
        obj.ring();
        obj.lift();
        obj.disconnect();
    }
}
