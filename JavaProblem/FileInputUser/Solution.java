package JavaProblem.FileInputUser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
       public static Map<String,Integer> processData(ArrayList<String> array) {

        Map<String, Integer> departmentToHighestPaid = new HashMap<>();
 
        Map<String, Integer> departmentToHighestSalary = new HashMap<>();
      
        for (String line : array) {
            String[] details = line.split(", ");
            int employeeId = Integer.parseInt(details[0]);
            String department = details[2];
            int salary = Integer.parseInt(details[3]);
         
            if (!departmentToHighestSalary.containsKey(department) || salary > departmentToHighestSalary.get(department)) {
                departmentToHighestSalary.put(department, salary); 
                departmentToHighestPaid.put(department, employeeId);
            }
        }

        return departmentToHighestPaid;
    }

    public static void main(String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while (in.hasNextLine()) {
                inputData.add(in.nextLine());
                System.out.println();
            }
            Map<String, Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for (Map.Entry<String, Integer> e : retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
