import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner url = new Scanner(System.in);
        System.out.println("enter the url");
        String a = url.nextLine();
        if(a.endsWith(".com")){
            System.out.println("the website is commercial");
        } else if (a.endsWith(".org")) {
            System.out.println("the website is organizational");
        } else if (a.endsWith(".in")) {
            System.out.println("the website is indian");
        }
        else{
            System.out.println("this website is not recognized");
        }
    }
}
