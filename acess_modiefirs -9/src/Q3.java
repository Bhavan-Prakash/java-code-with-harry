import java.util.Scanner;

class cylinder2{
    public cylinder2(){
        System.out.println("enter the radius : ");
        Scanner r = new Scanner(System.in);
        int radius = r.nextInt();
        System.out.println("the radius has been set to : " + radius);
    }
}

public class Q3 {
    public static void main(String[] args) {
        cylinder2 cla = new cylinder2();
    }
}
