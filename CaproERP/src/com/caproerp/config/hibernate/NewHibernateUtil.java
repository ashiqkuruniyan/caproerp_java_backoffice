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
            config.addAnnotatedClass(com.caproerp.model.CaproErpBranches.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpAdmin.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpCountry.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpStates.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpProducts.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpActivities.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpCategory.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpBrands.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpEmployees.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpProductsPK.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpRoutes.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpUnitTypes.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpUsers.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpEmployees_1.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpAdmin_1.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpBranches_1.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpStates_1.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpUsers_1.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpBrands_1.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpUnitTypes_1.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpCountry_1.class);
            config.addAnnotatedClass(com.caproerp.model.CaproErpRoutes_1.class);
            

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
