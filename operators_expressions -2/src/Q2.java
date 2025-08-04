import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        int given = 30;
        Scanner user = new Scanner(System.in);
        System.out.println("enter a no");
        int b = user.nextInt();
        if(b>given){
            System.out.println("the user no is greater than fixed no");
        }else {
            System.out.println("the user no is smaller than fixed no");
        }
    }
}