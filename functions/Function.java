import java.util.*;

public class Function {
    public static void print(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = s1.nextLine();

        print(name);

    }
}
