package com.caproerp.config.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class NewHibernateUtil {
    private static SessionFactory sessionFactory;

    static {
        try {
            // Load Hibernate configuration from hibernate.cfg.xml
            Configuration config = new Configuration().configure("/hibernate.cfg.xml");
            
            // Build service registry
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(config.getProperties())
                    .build();

            // Build session factory
            config.addAnnotatedClass(com.caproerp.branch.model.CaproErpBranches.class);
            config.addAnnotatedClass(com.caproerp.branch.model.CaproErpAdmin.class);
            config.addAnnotatedClass(com.caproerp.branch.model.CaproErpCountry.class);
            config.addAnnotatedClass(com.caproerp.branch.model.CaproErpStates.class);
            sessionFactory = config.buildSessionFactory(serviceRegistry);
        } catch (HibernateException e) {
            System.err.println("SessionFactory creation failed: " + e);
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
