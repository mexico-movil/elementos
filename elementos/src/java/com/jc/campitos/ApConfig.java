/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.campitos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author campitos
 */
@Configuration
public class ApConfig {
    
    
    @Bean
    public ServicioCuenta crearCuenta(){
        return new CuentaAhorroImpl();
    }
}
