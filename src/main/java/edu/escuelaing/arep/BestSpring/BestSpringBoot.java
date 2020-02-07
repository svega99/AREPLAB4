/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.BestSpring;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.escuelaing.arep.BestSpring.Annotations.web;

/**
 *
 * @author santiago.vega-r
 */
public class BestSpringBoot {
    
    public static void main(String [] args){
        String className = "edu.escuelaing.arep.BestSpring.WebService.WebService";
        try {
            Class c = Class.forName(className);
            Method[] methods=c.getMethods();
            for (Method m :methods) {
            	if (m.isAnnotationPresent(web.class)) {
            		System.out.println("Ejecutando metodo "+m.getName());
            		System.out.println("En clase "+c.getName());
            		try {
            			System.out.println(m.invoke(null));
  
            			} catch (Throwable ex) {
            				System.out.printf("Test %s failed: %s %n", m, ex.getCause());

            			}
            	}
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BestSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
