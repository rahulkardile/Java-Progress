package CollectionFrame.List.StackDS;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> animal =  new Stack<>();

        animal.push("Lion");
        animal.push("Dog");
        animal.push("Cat");
        animal.push("Hourse");

        System.out.println("Stack : " + animal);

        // to get top element
        System.out.println(animal.peek());

        // to get and remove top element 
        System.out.println(animal.pop());


    }
}
