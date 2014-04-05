
package com.jc.campitos;

public class ProbarOperaciones {
  public static void main(String args[]){
      
         DAOPruebaImpl d=new DAOPruebaImpl();
         Prueba p=new Prueba();
         //p.setId(2);
        // p.setNombre("Mikey Mouse");
        // d.actualizarRegistro(p); 
         for(Prueba pr:d.buscarTodos() ){
            System.out.println( pr.getNombre()+ " tu id : "+pr.getId());
         }
            
         
  }  
    
}
