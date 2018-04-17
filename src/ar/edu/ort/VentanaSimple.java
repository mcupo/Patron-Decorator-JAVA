package ar.edu.ort;
/**
 * Interfaz ventana
 * @author MCUPO
 *
 */
public class VentanaSimple implements ComponenteVisual {

	 public void draw() {
	        // draw window
	    	System.out.println("dibujo una ventana");
	    }
	 
	    public String getDescription() {
	        return "simple window";
	    }

}

