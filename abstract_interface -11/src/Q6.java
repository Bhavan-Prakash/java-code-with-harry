interface smarttv{
    public void smartremote();
}

interface tvremote extends smarttv{
    public void remote();
}

class smarttvremote implements tvremote{
    @Override
    public void remote() {
        System.out.println("im remote from tvremote");
    }

    @Override
    public void smartremote() {
        System.out.println("im extended interface from smarttv");
    }
}

public class Q6 {
    public static void main(String[] args) {
        tvremote obj = new smarttvremote();
        smarttvremote obj2 = new smarttvremote();
        obj.remote();
        obj2.smartremote();

    }
}
