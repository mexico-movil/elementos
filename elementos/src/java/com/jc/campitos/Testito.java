/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.campitos;


import com.jc.campitos.capitulo2.ServicioNomina;
import java.io.Console;
import java.io.IOException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author campitos
 */
public class Testito {
    
  public static void main(String args[]){
      System.out.println("Bienvenido al maravilloso mundo de SPRING");
    /* FileSystemXmlApplicationContext ctx=
          new FileSystemXmlApplicationContext("web/WEB-INF/dispatcher-servlet.xml");
     
      
      ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("lugar de xml dentro de"
           + "los paquetes de clases");
      
      */
      
      
      
/*   Cargamos en contexto solo con codigo java   */
      ApplicationContext ctx=new AnnotationConfigApplicationContext(ApConfig.class);
  ServicioCuenta cuenta=ctx.getBean(ServicioCuenta.class);
 System.out.println(cuenta.crearCuenta());
 
 //Otro ejemplo más pero con una nomina... este es otro ejemplo de servicio trasnversal
       ServicioNomina nomina=                ctx.getBean(ServicioNomina.class);
       System.out.println(nomina.pagarNomina());
  
  }  
    
}
