package edu.escuelaing.arep.BestSpring.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 *  Anotación web 
 * 
 * @author santiago.vega-r
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface web {
	
	/**
	 * Valor de la anotacion que determinara la ruta donde se guardara el contenido del metodo que la use
	 * @return
	 */
    String value();
}
