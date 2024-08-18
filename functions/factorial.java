public class factorial {

    public static int fact(int num) {

        if (num < 0) {
            System.out.println("Invalid Number!");
            return 0;
        }

        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
