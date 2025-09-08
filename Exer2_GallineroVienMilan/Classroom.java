import java.util.ArrayList;

public class Classroom {
    public ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void showAllStudents(){
        for (Student s : students){
            s.displayInfo();
        }
    }
}
