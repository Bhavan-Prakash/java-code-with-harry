public class Q3 {
    int recursive(int a){
        int temp = 0;
        for(int i =1 ; i<=a;i++){
            temp += i;
        }
        System.out.println("the sum of first " + a + " natural numbers is :" + temp);
        return 0;
    }

    public static void main(String[] args) {
        Q3 obj = new Q3();
        obj.recursive(5);
    }
}
