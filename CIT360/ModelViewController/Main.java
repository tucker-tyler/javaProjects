public class Main {

   public static void main(String[] args) {

      Student model  = retrieveStudent();

      StudentView view = new StudentView();

      StudentController controller = new StudentController(model, view);

      controller.updateView();

      controller.setStudentName("John");

      controller.updateView();
   }

   private static Student retrieveStudent(){
      Student student = new Student();
      student.setName("Tyler");
      student.setRollNumber("5");
      return student;
   }
}