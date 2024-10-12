package TestJava;

interface Play {
    void game();
}

interface Boy {
    void study();
}

class Activity implements Play, Boy {
    public void game() {
        System.out.println("Boy is playing");
    }

    public void study() {
        System.out.println("Boy is studing");
    }
}

public class MultipleInheritence {
    public static void main(String[] args) {
        Activity activity = new Activity();
        activity.game();
        activity.study();
    }
}
