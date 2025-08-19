import java.util.Scanner;

class square {
    int side;
    Scanner in = new Scanner(System.in);
    public void getValues(){
        System.out.println("Enter the value of side of Square");
        side = in.nextInt();
    }

    public int area(){
        int ar = side * side;
        return ar;
    }
}

public class Q3 {
    public static void main(String[] args) {
        square cla = new square();
        cla.getValues();
        System.out.println(cla.area());
    }
}
