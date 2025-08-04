import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the marks obtained in subject one out of 100");
        float a = input.nextFloat();
        System.out.println("Enter the marks obtained in subject two out of 100");
        float b = input.nextFloat();
        System.out.println("Enter the marks obtained in subject three out of 100");
        float c = input.nextFloat();

        float d = a+b+c;

        if(((d/300)*100)>40){
            System.out.println("you have passed as your total marks greater than 40%");
        } else if (((a/100)*100)>33 && ((b/100)*100)>33 && ((c/100)*100)>33) {
            System.out.println("you have passed as your marks in each subject is greater than 33%");
        }
        else{
            System.out.println("You have failed asshole");
        }
    }
}