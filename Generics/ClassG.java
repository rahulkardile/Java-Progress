package Generics;

public class ClassG<T> {
    // T is the type which is comming from user itself at the time of declaration.
    T value;

    public void setValue(T o){
        this.value = o;
    }

    public T getValue(){
        return value;
    }

    public static void main(String[] args) {
        ClassG<Integer> g = new ClassG<>();

        // g.setValue("1"); // now this is not acceptable.
        
        g.setValue(2);
        int i = (Integer) g.getValue();
    
        System.out.println(i);

    }

}
