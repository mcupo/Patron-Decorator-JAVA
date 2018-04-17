package ar.edu.ort;

//Clase decorador concreto
public class DecoradorScrollHorizontal extends DecoradorVentana {
	
    public DecoradorScrollHorizontal (ComponenteVisual ventanaDecorada) {
        super(ventanaDecorada);
    }
 
    public void dibujar() {
    	ventanaDecorada.dibujar();
        dibujarScrollHorizontal();
    }
 
    private void dibujarScrollHorizontal() {
    	System.out.println("decoro con una horizontal scrollbar");
    }
 
    public String getDescripcion() {
        return ventanaDecorada.getDescripcion() + ", incluyendo scroll horizontal";
    }
}