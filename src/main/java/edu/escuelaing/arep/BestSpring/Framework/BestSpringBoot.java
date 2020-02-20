/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.BestSpring.Framework;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Set;


import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import edu.escuelaing.arep.BestSpring.Annotations.web;


/**
 * Lee y almacena los POJOS que se encuentran en un paquete 
 *
 * @author santiago.vega-r
 */
public class BestSpringBoot {
    
	private static HashMap<String,String> rutaPaginas= new HashMap<>();
	
	/**
	 * Lee los POJOS que se encuentran en un paquete, donde se encuentran las paginas y los guarda en un HashMap
	 */
    public static void leerPaginas(){
    	
    	Reflections reflections = new Reflections("edu.escuelaing.arep.BestSpring.WebService", new SubTypesScanner(false)); 
    	
    	Set<Class<? extends Object>> clases =  reflections.getSubTypesOf(Object.class); 
    	
    	for (Class c:clases) {
                Method[] methods=c.getMethods();
                for (Method m :methods) {
                	if (m.isAnnotationPresent(web.class)) {
                		
                		try {
                			String html= (String) m.invoke(null);
                			String ruta= m.getAnnotation(web.class).value();
                			
                			
                			rutaPaginas.put(ruta, html);
                			} catch (Throwable ex) {
                				System.out.printf("Test %s failed: %s %n", m, ex.getCause());

                			}
                	}
                }
                
    	}
    	
       
    }

    /**
     * Devuelve el HashMap con la ruta y el contenido del html
     * @return El HashMap
     */
	public static HashMap<String,String> getRutaPaginas() {
		return rutaPaginas;
	}


	
}
