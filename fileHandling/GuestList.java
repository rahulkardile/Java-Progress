package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {
        
        try {

            Scanner scan = new Scanner(System.in);
            FileWriter guesWriter = new FileWriter("geustList.txt");

            while (true) {
                
                System.out.println("Enter names, an empty line quits.");
                
                String line = scan.nextLine();

                if(line.isEmpty()){
                    System.out.println("Thank you buddy!");
                    guesWriter.close();
                    break;
                }

                line += "\n";
                guesWriter.append(line);
            }

            System.out.println("Search a geust?");
            String name = scan.nextLine();
            File file = new File("geustList.txt");

            try (Scanner scanFile = new Scanner(file)){
                    while (scanFile.hasNextLine()) {

                        if(scanFile.next().equals(name)){
                            System.out.println( "We found it : ");
                        }

                    }                
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
