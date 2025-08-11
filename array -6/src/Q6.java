import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("enter the no's in the array :");
        for(int i=0;i< arr.length;i++){
            arr[i]= in.nextInt();
        }
        System.out.print("no's on the array are : ");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("highest no is the array is : "+ max);
    }
}
