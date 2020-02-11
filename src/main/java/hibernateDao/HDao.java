package hibernateDao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HDao {
	private Session session = null;
	
	public  SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(PersonBean.class);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration
                .buildSessionFactory(builder.build());
        return sessionFactory;
    }
	
	public void startSesion() {
		session = getSessionFactory().openSession();
		System.out.println("Session started...");
	}
	public void closeSession() {
		if(session != null)
		{	session.close();
			System.out.println("Session closed.");
		}else {
			System.out.println("Session never started.");
		}
	}
	public  void insertPerson(PersonBean e) throws Exception{
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
    }
	
	public  List<PersonBean> read() {
        
        @SuppressWarnings("unchecked")
		List<PersonBean> custlist= session.createQuery("FROM person").list();
        
        return custlist;
 
    }
	
	public  PersonBean findByID(Integer id) {
        PersonBean e = (PersonBean) session.load(PersonBean.class, id);
        return e;
    }
}
