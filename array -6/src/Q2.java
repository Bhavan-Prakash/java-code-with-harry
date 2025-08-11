import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        int [] arr = {20,30,99,84,57,4,3,55,8};
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no to check");
        int user = in.nextInt();
        int l =0;
        boolean found = false;
        while (l<arr.length){
            if(arr[l]==user){
                found = true;
                break;
            }
            l++;
        }
        if(found){
            System.out.println(user+" is present in the array");
        }else{
            System.out.println(user+" is not present in the array");
        }

    }
}
