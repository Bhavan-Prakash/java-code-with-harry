class monkey2{
    public void jump(){
        System.out.println("im jump method from monkey2");
    }

    public void bite(){
        System.out.println("im a bite method from monkey2");
    }
}

interface basicanimal3{
    public void eat();
    public void sleep();



}

class human2 extends monkey2 implements basicanimal3{
    @Override
    public void eat(){
        System.out.println("im eat method from interface");
    }

    @Override
    public void sleep(){
        System.out.println("im sleep method from interface");
    }

}

public class Q5 {
    public static void main(String[] args) {
        monkey2 obj = new human2();
        basicanimal3 obj2 = new human2();
        obj2.eat();
        obj2.sleep();
        obj.bite();
        obj.jump();
    }
}
