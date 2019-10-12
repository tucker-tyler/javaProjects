/* Employee MVC Class:
// Runs the code from the other files to execute the program
*/

public class EmployeeMVC {

// Main class
   public static void main(String[] args) {

// Retrieve Employee record based on his enrollment number from the database
      Employee model  = retriveEmployeeFromDatabase();

// Create a view to write Employee details on console
      EmployeeView view = new EmployeeView();

// Employee controller creation
      EmployeeController controller = new EmployeeController(model, view);

      controller.updateView();

      controller.setEmployeeName("Tyler");

      controller.updateView();
   }

// Returns the info of the student from the database
   private static Employee retriveEmployeeFromDatabase(){
      Employee employee = new Employee();
      employee.setName("Scott");
      employee.setIdNumber("1365");
      return employee;
   }
}
