package com.mondee;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {

                Configuration configuration = new Configuration();

                Properties settings = new Properties();

                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/sai");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "root");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

                settings.put(Environment.SHOW_SQL, "true");

                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                settings.put(Environment.HBM2DDL_AUTO, "create");
                configuration.setProperties(settings);

                configuration.addAnnotatedClass(Employee.class);
                configuration.addAnnotatedClass(Developer.class);
                
                
                configuration.addAnnotatedClass(com.payment.Payment.class);
                configuration.addAnnotatedClass(com.payment.CreditCard.class);
                configuration.addAnnotatedClass(com.payment.Cheque.class);
                
                configuration.addAnnotatedClass(com.payments.payments.class);
                configuration.addAnnotatedClass(com.payments.CreditCards.class);
                configuration.addAnnotatedClass(com.payments.Cheques.class);

                
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
}