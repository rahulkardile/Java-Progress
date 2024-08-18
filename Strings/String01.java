import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {

        // Creating String
        String name = "Tony";
        String intro = "My Name is Tony Stark!";

        // Input String
        System.out.println("Enter Your Full Name : ");
        Scanner sc = new Scanner(System.in);

        // to get a word 
        // String fullName = sc.next();

        // to get a line
        String fullName = sc.nextLine();
        System.out.println("Your Full Name is : " + fullName);

        
    }
}
