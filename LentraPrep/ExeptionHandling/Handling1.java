package ExeptionHandling;

public class Handling1 {
    public static void main(String[] args) {
        int[] mark = { 91, 87, 88 };

        try {
            System.out.println(mark[8]);
        } catch (Exception e) {
            // System.out.println(e.getMessage());
            System.out.println("Makr Not Found");
        }

        System.out.println("Student name is Rahul");

    }
}
