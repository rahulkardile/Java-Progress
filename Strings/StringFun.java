package Strings;

public class StringFun {
    public static void main(String[] args) {

        // Concatenation
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;

        // System.out.println(fullName);

        // length
        System.out.println(fullName.length());

        // charAt
        // for (int i = 0; i < fullName.length(); i++) {
        // System.out.println(fullName.charAt(i));
        // }

        String name1 = "Tony";
        String name2 = "Tony";

        // 1. campare fun
        // if(name1.compareTo(name2) == 0){
        // System.out.println("String are Equal!");
        // }else{
        // System.out.println("String are not Equal");
        // }

        // 2.
        // if (name1 == name2) {
        // System.out.println("String are Equal!");
        // } else {
        // System.out.println("String are not Equal");
        // }

        // 3.
        // if (new String("Tony") == new String("Tony")) {
        // System.out.println("String are Equal!");
        // } else {
        // System.out.println("String are not Equal");
        // }

        String sentence = "My name is tonye bhai";
        System.out.println(sentence.substring(11));
        System.out.println(sentence.substring(11, 15));

        String num = "123";
        int numPars = Integer.parseInt(num);

    }
}
