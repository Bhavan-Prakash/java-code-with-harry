class monkey{
    public void jump(){
        System.out.println("im jump constructor from monkey");
    };
    public void bite(){
        System.out.println("im bite constructor from monkey");
    };

}

interface basicAnimal{
    void eat();

}

interface basicanimal2 extends basicAnimal{
    void sleep();
}

class human extends monkey implements basicanimal2{
    @Override
    public void eat(){
        System.out.println("im a eat method");
    }

    @Override
    public void sleep(){
        System.out.println("im a sleep method");
    }
}

public class Q3 {
    public static void main(String[] args) {
        human obj = new human();
        obj.eat();
        obj.sleep();
        obj.bite();
        obj.jump();
    }
}
