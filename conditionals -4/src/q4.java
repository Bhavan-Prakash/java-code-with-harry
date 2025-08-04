import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args){
        System.out.println("1 -- monday");
        System.out.println("2 -- tuesday");
        System.out.println("3 -- wednesday");
        System.out.println("4 -- thursday");
        System.out.println("5 -- friday");
        System.out.println("6 -- saturday");
        System.out.println("7 -- sunday");
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int a = in.nextInt();
        switch(a){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        }

    }
}
