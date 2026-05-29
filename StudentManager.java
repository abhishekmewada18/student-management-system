package StudentManagement;
import java.util.ArrayList;

public class StudentManager {
    
    // Sabhi students ki list
    ArrayList<Student> students = new ArrayList<>();

    // Student add karna
    public void addStudent(int rollNo, String name, double marks) {
        Student s = new Student(rollNo, name, marks);
        students.add(s);
        System.out.println("Student added successfully!");
    }

    // Sabhi students dikhana
    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        System.out.println("===== All Students =====");
        for (Student s : students) {
            s.display();
        }
    }

    // Roll number se student dhundhna
    public void searchStudent(int rollNo) {
        for (Student s : students) {
            if (s.rollNo == rollNo) {
                System.out.println("Student Found!");
                s.display();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Student delete karna
    public void deleteStudent(int rollNo) {
        for (Student s : students) {
            if (s.rollNo == rollNo) {
                students.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}