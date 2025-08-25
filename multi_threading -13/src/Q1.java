class test extends Thread {
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("good morning");
            i++;
        }
    }
}

class test2 extends Thread {
    int i = 0;

    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("welcome");
            i++;
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        test obj = new test();
        test2 obj2 = new test2();
        obj.start();
        obj2.start();
    }
}
