/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.campitos.capitulo2;

import com.jc.campitos.*;
import java.util.ArrayList;
import org.hibernate.Query;

/**
 *
 * @author campitos
 */
public class DAOPruebaImpl extends DAO {
    
    
    public void guardar(Prueba p){
        begin();
        getSession().save(p);
        commit();
        close();
        System.out.println("Prueba guardada con exito");
    }
    
    public void actualizar(Prueba p){
        begin();
        getSession().update(p);
        System.out.println("Prueba actualizada con exito");
        commit();
        close();
    }
    
    public ArrayList<Prueba> buscarTodos(){
        begin();
        Query q=   getSession().createQuery("from Prueba");
        ArrayList<Prueba> pruebas= (ArrayList<Prueba>)q.list();
        commit();
        close();
     
     return pruebas;
    }
    
    public Prueba  buscarPorId(int id){
        begin();
         Query q=getSession().createQuery("from Prueba where id=:id");
         q.setInteger("id", id);
     Prueba p=  (Prueba)  q.uniqueResult();
         commit();
         close();
    return p;
    }
    
    public void borrar(Prueba p){
               begin();
               getSession().delete(p);
               commit();
               close();
               System.out.println("registro borrado");
    }
}
