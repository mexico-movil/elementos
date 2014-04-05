
package com.jc.campitos;

import java.util.ArrayList;
import org.hibernate.Query;


public class DAOPruebaImpl extends DAO {
       
    public void insertarRegistro(Prueba p){
       begin(); 
       
       getSession().save(p);
       
       commit();
       close();
       System.out.println("Registro insertado");
    }
    
    //segunda operacion actualizar
    public void actualizarRegistro( Prueba p){
        begin();
        getSession().update(p);
        commit();
        close();
        System.out.println("registro actualizado");
    }
    
    //tercera operacion: buscarTodos
    public ArrayList<Prueba> buscarTodos(){
        begin();
   Query q=     getSession().createQuery("from Prueba");
       ArrayList<Prueba> registros=(ArrayList<Prueba>) q.list();
       commit();
       close();
        return registros;
    }
    
    
    
}
