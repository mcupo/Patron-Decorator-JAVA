package ar.edu.ort;

//Clase decorador concreto
public class DecoradorScrollHorizontal extends DecoradorVentana {
	
    public DecoradorScrollHorizontal (ComponenteVisual ventanaDecorada) {
        super(ventanaDecorada);
    }
 
    public void dibujar() {
    	super.dibujar();
        dibujarScrollHorizontal();
    }
 
    private void dibujarScrollHorizontal() {
    	System.out.println("decoro con una horizontal scrollbar");
    }
 
    public String getDescripcion() {
        return super.getDescripcion() + ", incluyendo scroll horizontal";
    }
}