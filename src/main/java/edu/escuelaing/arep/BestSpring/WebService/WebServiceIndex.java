/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.BestSpring.WebService;

import edu.escuelaing.arep.BestSpring.Annotations.web;

/**
 *
 * @author santiago.vega-r
 */
public class WebServiceIndex{

	
    @web("index.html")
    public static String content(){
    	return "<!DOCTYPE html>\n" + 
        		" <html>\n" + 
        		"<head>\n" + 
        		"<meta charset=\\\"UTF-8\\\">\n" + 
        		"<title>Index</title>\n" +
        		"</head>\n" + 
        		"<body>\n" + 
        		"<h1>Bienvenido a la pagina de prueba de mi Framework</h1>\n" + 
        		"Las otras paginas disponibles son: </br>"+
        		"<a href=\"/page.html\">page.html</a></br>"+
        		"<a href=\"/otrapagina.html\">otrapagina.html</a></br>"+
        		"</body>\n" + 
        		"</html>";
    }
    
    
    @web("otrapagina.html")
    public static String content2(){
        return "<!DOCTYPE html>\n" + 
        		" <html>\n" + 
        		"<head>\n" + 
        		"<meta charset=\\\"UTF-8\\\">\n" + 
        		"<title>Otra pagina</title>\n" +
        		"</head>\n" + 
        		"<body>\n" + 
        		"<h1>Otra pagina</h1>\n" + 
        		"</body>\n" + 
        		"</html>";
    }
}
