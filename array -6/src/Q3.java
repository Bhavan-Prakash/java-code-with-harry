import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner marks = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("enter the marks in the array : ");
        for(int i =0;i<arr.length;i++){
            arr[i] = marks.nextInt();
        }
        int proxy = 0;
        for(int num : arr){
            proxy += num;
        }
        int average = proxy/ arr.length;
        System.out.println("the average is : " + average);
    }
}
