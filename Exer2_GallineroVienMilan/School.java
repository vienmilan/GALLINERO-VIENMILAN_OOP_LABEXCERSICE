public class School {
    public Classroom classroom;

    public School(){
        classroom = new Classroom();
    }
    public void enrollStudent(String name, int age,int year,String gender){
        Student newStudent = new Student(name, age, year, gender);
        classroom.addStudent(newStudent);
    }

    public void displayStudents(){
        classroom.showAllStudents();
    }
}
