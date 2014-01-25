/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.campitos.capitulo2;

import com.jc.campitos.ServicioCuenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author campitos
 */
@Controller
@RequestMapping("/nomina")
public class ControladorNomina {
    
 @Autowired ServicioCuenta  servicio;
    
    
    @RequestMapping(value="/mensaje",method=RequestMethod.GET,
            headers ={"Accept=text/html"})
    @ResponseBody String hola(){
               return "bienvenidos al mundo de spring con REST, se pueden intercambiar paquetes:"+servicio.crearCuenta();
               
    }
    
}