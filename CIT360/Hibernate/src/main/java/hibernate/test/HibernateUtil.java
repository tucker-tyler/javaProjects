package hibernate.test;

//Imports
import java.io.File;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
    	// Try-Catch to create session
        try {
            return new AnnotationConfiguration().configure(new File("D:\\Latest Setup\\eclipse_juno_workspace\\corejavaTest\\hibernate.cgf.xml")).buildSessionFactory();
        }
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
    	//Closes the caches and connection pools
    	getSessionFactory().close();
    }
}