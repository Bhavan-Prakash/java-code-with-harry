import java.util.Scanner;

public class Q7{
    public static void main(String[] args){
        int [] arr = new int[5];
        Scanner no = new Scanner(System.in);
        System.out.println("enter the no's in the array");
        for(int i=0;i< arr.length;i++){
            arr[i] = no.nextInt();
        }
        System.out.println("your created array is as below: ");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        int min = arr[0];
        for(int j=1;j<5;j++){
            if(min>arr[j]){
                min=arr[j];
            }
        }
        System.out.println(min);
    }
}