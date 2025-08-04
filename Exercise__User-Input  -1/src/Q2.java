import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks of your first subject");
        double a = in.nextInt();
        System.out.println("Enter marks of your second subject");
        double b = in.nextInt();
        System.out.println("Enter marks of your third subject");
        double c = in.nextInt();

        double cgpa = (a+b+c)/300.0;
        System.out.println("your cgpa is as follow");
        System.out.print(cgpa);
    }
}
