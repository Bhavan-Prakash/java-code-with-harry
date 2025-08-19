class cellphone {
    public String ring(){
        return "Ringing..";
    }

    public String vibrate(){
        return "Vibrating..";
    }

}

public class Q2 {
    public static void main(String[] args) {
        cellphone cla = new cellphone();
        System.out.println(cla.ring());
        System.out.println(cla.vibrate());
    }
}
