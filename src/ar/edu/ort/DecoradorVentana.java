package ar.edu.ort;

//Clase decorador
public abstract class DecoradorVentana implements ComponenteVisual {
	
    private ComponenteVisual ventanaDecorada; // la ventana que va a ser decorada
 
    public DecoradorVentana (ComponenteVisual ventanaDecorada) {
        this.ventanaDecorada = ventanaDecorada;
    }
    
    public void dibujar() {
    	ventanaDecorada.dibujar();
    }
    
    public String getDescripcion() {
    	return ventanaDecorada.getDescripcion();
    }
}