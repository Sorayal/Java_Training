package test_hibernate_with_cfg.test_hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import test_hibernate_with_cfg.hibernate_util.HibernateUtil;

public class App {
    public static void main(String[] args) {
        // SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        HibernateUtil util = new HibernateUtil(1);

        Session session = util.getSessionFactory().openSession();
        session.beginTransaction();
        // session.createNativeQuery("").setParameter("")
        session.createQuery("");
        // session.save(myObject);
    }
}
