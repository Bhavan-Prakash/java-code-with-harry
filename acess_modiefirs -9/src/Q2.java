import java.util.Scanner;

class input{

    int height,radius;
    double area;
    public void getRadius(){
        System.out.println("enter the radius of the cylinder :");
        Scanner r = new Scanner(System.in);
        radius = r.nextInt();
    }

    public void getHeight(){
        System.out.println("enter the height of the cylinder :");
        Scanner h = new Scanner(System.in);
        height = h.nextInt();
    }

    public void setRadius(){
        System.out.println("the radius of the cylinder has been set to :" + radius);
    }

    public void setHeight(){
        System.out.println("the height of the cylinder has been set to :" + height);
    }

    public double volume(){
        area = 3.14*radius*radius*height;
        System.out.println("the voulume of the cylinder is :");
        return area;
    }
}
public class Q2 {
    public static void main(String[] args) {
        input cla = new input();
        cla.getRadius();
        cla.getHeight();
        cla.setRadius();
        cla.setHeight();
        System.out.println(cla.volume());
    }
}
