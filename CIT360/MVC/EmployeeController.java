/* Employee Controller
// 
*/

public class EmployeeController {
   private Employee model;
   private EmployeeView view;

   public EmployeeController(Employee model, EmployeeView view){
      this.model = model;
      this.view = view;
   }

// Getters and setters for employee name

   public void setEmployeeName(String name){
      model.setName(name);		
   }

   public String getEmployeeName(){
      return model.getName();		
   }
   
// Getters and setters for employee number

   public void setEmployeeIdNumber(String idNumber){
      model.setIdNumber(idNumber);
   }

   public String getEmployeeIdNumber(){
      return model.getIdNumber();		
   }
   
// Update employee view based on info retrieved

   public void updateView(){				
      view.printEmployeeDetails(model.getName(), model.getIdNumber());
   }	
}
