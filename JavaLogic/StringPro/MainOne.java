package StringPro;

public class MainOne {
    public static void main(String[] args) {

        // Reverse the String
        String name = "Rahul Kardile";
        String result = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            result += name.charAt(i);
        }

        // System.out.println(result);

        // extract Repeated Values
        String pairs = "abcckkdc";
        System.out.println(pairs.length());

        for(int i = 0; i < pairs.length() - 1; i++){
            char current = pairs.charAt(i);
            char next = pairs.charAt(i+1);
            
            if(current == next){
                System.out.println(next + " " +  current);
            }
        }

    }
}
