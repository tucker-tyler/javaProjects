package hibernate.test;

//Imports
import hibernate.test.dto.EmployeeEntity;
import org.hibernate.Session;

public class TestHibernate {
	
	public static void main(String[] args) {
	
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		EmployeeEntity emp = new EmployeeEntity();
		emp.setEmail("Admin@mail.com");
		emp.setFirstName("Admin");
		emp.setLastName("User");
		session.save(emp);
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
}