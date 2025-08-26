
public class Q1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try{
            int d = a/b;
        }catch(ArithmeticException e){
            System.out.println("haha");
        }catch (Exception e){
            System.out.println("hehheheh");
        }
    }
}
