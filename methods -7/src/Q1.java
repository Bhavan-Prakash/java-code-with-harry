public class Q1 {

    int method (int a){
        for(int i=0;i<=10;i++){
            System.out.println(a + " * " + i + " = " + (a*i));
        }
        return 0;
    }

    public static void main(String[] args) {
        Q1 obj = new Q1();
        obj.method(5);
    }
}
