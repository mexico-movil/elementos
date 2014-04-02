
package com.jc.campitos;

import org.hibernate.Query;

public class DAOPruebaImpl extends DAO {
       
    public void insertarRegistro(Prueba p){
       begin(); 
       
       getSession().save(p);
       
       commit();
       close();
       System.out.println("Registro insertado");
    }
    
    
    
}
