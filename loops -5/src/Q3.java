import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("enter the value of n");
        int input = n.nextInt();
        int z = 0;
        while(10>z){
            z++;
            int alpha = input*z;
            System.out.println(input + "*" + z + "=" + alpha);
        }

    }
}
