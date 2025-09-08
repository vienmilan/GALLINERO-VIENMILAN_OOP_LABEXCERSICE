public class List {
    public static void main(String[] args) {
        School school = new School();

         school.enrollStudent("Allen Maimad", 21, 2, "male");
         school.enrollStudent("Cj Salem", 21, 2, "male");
         school.enrollStudent("Mark Minlaud", 21, 2, "Double Blade");
         school.enrollStudent("Aeyesha Fuertes", 19, 2, "Female");
         school.enrollStudent("Leonil Macalinao", 20, 2, "Unidentified");
         school.enrollStudent("Mohammad Pasamba", 21, 2, "NOT HUMAN");

         System.out.println("list");
         school.displayStudents();
    }
}
