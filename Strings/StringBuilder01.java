package Strings;

public class StringBuilder01 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");
        // Tony
        // System.out.println(sb);

        // T
        // System.out.println(sb.charAt(0));

        // Pony
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);
        
        // STony
        // sb.insert(0, 'S');
        // System.out.println(sb);

        // delete the extra 'n'
        // Ty
        // sb.delete(1, 3);
        // System.out.println(sb);
    
        sb.append(" ");  //str += " "
        sb.append("s"); //str += "s"
        sb.append("t"); //str += "t"
        sb.append("a"); //str += "a"
        sb.append("r");
        sb.append("k");

        System.out.println(sb);

    }
}
