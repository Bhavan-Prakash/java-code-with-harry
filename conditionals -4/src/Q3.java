import java.util.Scanner;

public class Q3 {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("enter your income");
        float a = inp.nextFloat();
        if(a>250000.0 && a<500000.0){
            System.out.println("your tax slab is 5% i.e : " + a*5/100);
        } else if (a>500000.0 && a<1000000.0) {
            System.out.println("your tax slab is 20% i.e : " + a*20/100);
        } else if (a>1000000.0) {
            System.out.println("your tax slab is 30% i.e : " + a*30/100);
        }
        else{
            System.out.println("your income is below 2.5l theres no tax");
        }
    }
}
