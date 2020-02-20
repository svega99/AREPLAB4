/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    String value();
}
