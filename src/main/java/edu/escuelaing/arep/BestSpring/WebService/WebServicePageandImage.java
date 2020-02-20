package edu.escuelaing.arep.BestSpring.WebService;

import edu.escuelaing.arep.BestSpring.Annotations.web;

/**
 * Clase donde cada metodo sera una pagina html
 *
 * @author santiago.vega-r
 */
public class WebServicePageandImage{

	
	/**
	 *  Retorna el contenido de una pagina HTML
	 * @return Contenido del HTML
	 */
	@web("page.html")
	public static String content() {
		
		return "<!DOCTYPE html>\r\n" + 
				" <html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\\\"UTF-8\\\">\r\n" + 
				"<title>Page and Image</title>\r\n" + 
				"<script src=\"app.js\"></script>\r\n" + 
				"\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<h1>Usted esta en page.html</h1>\r\n" + 
				"<img src=\"labinformatica.png\" >\r\n" +
				"</br>"+
				"<span onclick='Module.alerta()'>\r\n" + 
				"<img src=\"logo.jpg\" >\r\n" + 
				"</span>\r\n" + 
				"</body>\r\n" + 
				"</html>";
	}

}
