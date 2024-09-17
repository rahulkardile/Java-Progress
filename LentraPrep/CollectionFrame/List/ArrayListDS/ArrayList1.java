package CollectionFrame.List.ArrayListDS;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        // String[] StudentName = new String[30];
        // StudentName[0]="Rakesh";

        // // StudentName[1]...StudentName[28]
        // StudentName[29]="HARISH";

        // StudentName[30]="HARISH"; //Will get out of bounnd exception.

        ArrayList<String> studentName = new ArrayList<String>();

        studentName.add("Rakesh");
        studentName.add("Vikas");
        studentName.add("NIkHil");
        studentName.add("Rohit"); // this will add element at the end of the list

        System.out.println(studentName);

        studentName.add(1, "Rahul"); // to data at perticuler element

        System.out.println(studentName);

        ArrayList<String> Surnames = new ArrayList<>();
        Surnames.add("MAche");
        Surnames.add("Rahul");
        Surnames.add("Sumesh");

        studentName.addAll(Surnames); // we can add hole list to the arrayList
        System.out.println(studentName);

        // GET
        System.out.println(" Get Element : " + studentName.get(4)); // To get element at perticuler index

        // Set
        studentName.set(2, "Nikhil"); // it is used to update an element

        // check element
        System.out.println(studentName.contains("Rahul")); // checking is this element is present or not

        // Iteration over elements
        for (int i = 0; i < studentName.size(); i++) {
            System.out.println("The element is : " + studentName.get(i));
        }

        // with the help of for each
        for (String ele : studentName) {
            System.out.println("foreach is element is : "+ele);
        }

        // Iterator
        Iterator<String> it = studentName.iterator();

        while (it.hasNext()) {
            System.out.println("iterator value : " + it.next());
        }


        // Remove
        studentName.remove(3); // it will remove from the index 3
        studentName.remove(String.valueOf("Rahul")); // remove by value

        System.out.println(studentName);

        // Remove Full List
        studentName.clear(); // it will remove all the element
        System.out.println(studentName);

    }
}
