package Strings;

public class StringReverse {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Aman");
        StringBuilder reverseString = new StringBuilder("");

        for (int i = name.length() -1 ; i >= 0; i--) {
            reverseString.append(name.charAt(i));
        }

        System.out.println(reverseString);

    }
}
