package fileHandling;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        try {
        
            FileWriter writer = new FileWriter("textfile.txt");
            System.out.println("Start writing your story buddy!");
            while (true) {
                String line = scan.nextLine();
                if(line.contains("that's it!")){
                    scan.close();
                    break;
                }
                line += "\n";
                writer.append(line);
            }

        writer.close();
        
        System.out.println("writting successfull.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}