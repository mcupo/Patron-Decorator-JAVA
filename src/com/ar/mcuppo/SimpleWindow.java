package com.ar.mcuppo;
/**
 * Interfaz ventana
 * @author MCUPO
 *
 */
public class SimpleWindow implements Window {

	 public void draw() {
	        // draw window
	    	System.out.println("dibujo una ventana");
	    }
	 
	    public String getDescription() {
	        return "simple window";
	    }

}

