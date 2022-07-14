package test_hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

public class App {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        // session.save(myObject);
    }
}
