/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.campitos;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author campitos
 */
public class Testito {
    
  public static void main(String args[]){
      System.out.println("Hola mundo");
      FileSystemXmlApplicationContext ctx=
              new FileSystemXmlApplicationContext("web/WEB-INF/dispatcher-servlet.xml");
   // ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("lugar de xml dentro de"
   //         + "los paquetes de clases");
  }  
    
}
