package arrays;

public class BasicArray {
    public static void main(String[] args) {
        int age[];  // declerations
        age = new int[5]; //allocation

        age[0] = 25;
        age[1] = 30;
        age[2] = 35;
        age[3] = 40;
        age[4] = 45;
    
        System.out.println(age[1]);
        System.out.println("This is the length of the array " + age.length);

    }
}
