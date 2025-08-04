import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("give me the value of n :");
        int input = n.nextInt();
        int count = 0;
        int sum = 0;
        while(input>count){
            count++;
            if(count%2==0){
                sum+=count;
            }
        }
        System.out.println(sum);
    }
}
