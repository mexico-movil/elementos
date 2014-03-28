/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.campitos;

/**
 *
 * @author campitos
 */
public class TestPrueba {
    public static void main(String args[]){
        Prueba p=new Prueba();
        p.setId(1);
       // p.setNombre("Raton Vaquero");
        
        DAOPruebaImpl dp=new DAOPruebaImpl();
          //dp.guardar(p);
          //dp.actualizar(p);
          // dp.guardar(p);
          // System.out.println(    dp.buscarPorId(1));
           dp.borrar(p);
        System.out.println("todos:");
        for(Prueba prueba:dp.buscarTodos()){
         System.out.println(   prueba);
        }
    }
}
