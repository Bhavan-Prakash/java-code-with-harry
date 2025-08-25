class test3 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("good morning");
            i++;
        }
    }
}

class test4 extends Thread {
    int i = 0;

    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("welcome");
            i++;
        }
    }

    public void sleep(){
        System.out.println("im sleep method");
    }
}

public class Q2 {
    public static void main(String[] args) {
        test3 obj = new test3();
        test4 obj2 = new test4();
        obj.start();
        obj2.start();
    }
}
