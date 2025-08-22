class rectangle{
    public rectangle(){
        System.out.println("im a rectangle constructor");
    }
}

class cuboid extends rectangle{
    public cuboid(){
        System.out.println("im a cuboid constructor");
    }
}


public class Q2 {
    public static void main(String[] args) {
        cuboid obj = new cuboid();
    }
}
