package staticKeyWord;

class Student {
    public static int totalStudents = 0;
    private String name, email, age;

    Student(String name, String email, String age) {
        this.age = age;
        this.email = email;
        this.name = name;

        totalStudents++;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getTotalStudent() {
        return totalStudents;
    }

}

public class Static1 {

    public static String trimAndUppercase(String str) {
        if (str != null) {
            return str.trim().toUpperCase();
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Rahul kardile", "rahulkardile321@gmail.com", "31");
        Student student2 = new Student("Rahul kardile", "rahulkardile321@gmail.com", "31");
        Student student3 = new Student("Rahul kardile", "rahulkardile321@gmail.com", "31");
        Student student4 = new Student("Rahul kardile", "rahulkardile321@gmail.com", "31");
        Student student5 = new Student("Rahul kardile", "rahulkardile321@gmail.com", "31");

        System.out.println(Student.totalStudents);
        System.out.println(trimAndUppercase("helllo   brother   how are you!"));
    }
}
