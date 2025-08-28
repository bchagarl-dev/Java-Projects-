import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) { students.add(s); }
    public void printAllStudents() { students.forEach(System.out::println); }
}
