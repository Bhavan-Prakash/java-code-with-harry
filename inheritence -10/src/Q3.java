import java.util.Scanner;

class circle2{
    public circle2(int r){
        System.out.println("area of circle is : " + (3.14*(r*r)));
    }
}

class cylinder2 extends circle2{
    public cylinder2 (int r,int r2,int h){
        super(r);
        System.out.println("area of cy. is : " + (3.14*(r2*r2)));
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of radius for circle");
        int r = in.nextInt();
        System.out.println("enter the value of radius for cylinder");
        int r2 = in.nextInt();
        System.out.println("enter the value of height for cylinder");

        int h = in.nextInt();


        cylinder2 obj = new cylinder2(r,r2,h);



    }
}
