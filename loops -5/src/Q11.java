import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number:");
        int no = inp.nextInt();
        int r;
        for(int i =2;i<=no;i++){
            for(int j=1;j<no;j++){
                if(j%i==0){
                    System.out.println(j);
                }
            }
        }
    }
}
