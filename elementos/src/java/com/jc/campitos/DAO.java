package com.jc.campitos;


import com.jc.campitos.capitulo2.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
public class DAO {
    
private static final Logger log = Logger.getAnonymousLogger();
private static final ThreadLocal session = new ThreadLocal();
private static final SessionFactory sessionFactory =
        
new AnnotationConfiguration().configure().buildSessionFactory();
public DAO() {
}
public static Session getSession() {
Session session = (Session) DAO.session.get();
if (session == null) {
session = sessionFactory.openSession();
DAO.session.set(session);
}
return session;
}
protected  void begin() {
getSession().beginTransaction();
}
protected   void commit() {
getSession().getTransaction().commit();
}
protected  void rollback() {
try {
getSession().getTransaction().rollback();
} catch( HibernateException e ) {
log.log(Level.WARNING,"No se puede hacer el roolback",e);
}
try {
getSession().close();
} catch( HibernateException e ) {
log.log(Level.WARNING,"Imposible cerrar",e);
}
DAO.session.set(null);
}

public static void close() {
getSession().close();
DAO.session.set(null);
}

}