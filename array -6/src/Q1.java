import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        float [] arr = new float[5];
        Scanner input = new Scanner(System.in);
        System.out.println("enter the no's in the array");
        float num = 0;
        for(int i =0;i<5;i++){
            arr[i] =  input.nextFloat();
            num += arr[i];
        }
        System.out.println(num);
    }
}