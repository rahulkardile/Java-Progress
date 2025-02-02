package recursion;

public class Recuresion {

    // 1. print number from 5 to 1;
    static void function(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        function(n - 1);
    }

    public static void main(String[] args) {
        function(6);
    }

}
