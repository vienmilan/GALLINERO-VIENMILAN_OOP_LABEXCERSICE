public class Student{
    public String name;
    public int age;
    public int year;
    public String gender;


    public Student(String name, int age, int year,String gender) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.gender = gender;
    }

     public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Gender: " + gender);
        System.out.println("        ");
     }  
}
