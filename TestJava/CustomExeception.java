package TestJava;

import java.util.Scanner;

//it will create a massage and own exception
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExeception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        try {
            checkNumber(num);
        } catch (CustomException e) {
            System.out.println( e.getMessage());
        }
    }

    static void checkNumber(int number) throws CustomException {
        if (number <= 0) {
            throw new CustomException("Number must be greater than zero!");
        } else {
            System.out.println("Number is valid: " + number);
        }
    }

}
