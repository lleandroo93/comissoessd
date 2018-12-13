package br.com.sd.comissoes.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        Configuration configuration = new Configuration();
        configuration.configure();
        
        StandardServiceRegistryBuilder serviceRegistryBuilder 
                = new StandardServiceRegistryBuilder();
        
        serviceRegistryBuilder.
                applySettings(configuration.getProperties());
        StandardServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
        
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }
    
    public static Session getSession() {
        return sessionFactory.openSession();
    }
}
