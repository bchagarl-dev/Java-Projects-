import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student("Alice", 1));
        manager.addStudent(new Student("Bob", 2));
        manager.printAllStudents();
    }
}
