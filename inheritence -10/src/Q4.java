import java.util.Scanner;

class rectangle2{
    public int area(int l,int b){
        return (2*(l*b));
    }

    public int volume(int l,int b){
        return (l*b);
    }
}

class square2 extends rectangle2{
    public int area2(int s){
        return (s*s);
    }
}


public class Q4 {
    public static void main(String[] args) {
        square2 obj = new square2();

        Scanner in = new Scanner(System.in);

        System.out.println("enter the length of the rec :");
        int len = in.nextInt();
        System.out.println("enter the width of the rec :");
        int wdth = in.nextInt();
        System.out.println("enter the side of the square :");
        int side = in.nextInt();
        System.out.println("area of rec is :");
        System.out.println(obj.area(len,wdth));
        System.out.println("volume of rec is :");
        System.out.println(obj.volume(len,wdth));
        System.out.println("area of square is :");
        System.out.println(obj.area2(side));


    }
}
