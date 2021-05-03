package com.company.myapp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import java.util.List;

public abstract class ClienteDAO {

    private static SessionFactory sf = new Configuration().configure().buildSessionFactory();

    public static List<Cliente> getClientes(){
        Session session = sf.openSession();
        return (List<Cliente>) session.createQuery("FROM Cliente").list();
    }

    public static void guardarCliente(Cliente cliente){
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(cliente);
        session.getTransaction().commit();
    }
}