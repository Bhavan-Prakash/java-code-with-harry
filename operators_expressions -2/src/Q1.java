import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.println("enter your grade");
        int a = grade.nextInt();
        int b = a+8;
        System.out.println("encrypted grade is: " + b);
        System.out.println("decrypted grade is: " + a);
    }
}