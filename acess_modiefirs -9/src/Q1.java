import java.util.Scanner;

class cylinder{

    int al;

    public void getRadius(){
        System.out.println("enter the value of radius : ");
        Scanner r = new Scanner(System.in);
        al = r.nextInt();
    }

    public void setRadius(){
        System.out.println("radius has been set to :" + al);
    }
}

public class Q1 {
    public static void main(String[] args) {
        cylinder cla = new cylinder();
        cla.getRadius();
        cla.setRadius();
    }
}