package manytomany;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
private static SessionFactory sessionFactory;
public static SessionFactory getSessionFactory()
{
SessionFactory factory=new Configuration()
.configure("hibernate1.cfg.xml")
.buildSessionFactory();
return factory;
}
}
