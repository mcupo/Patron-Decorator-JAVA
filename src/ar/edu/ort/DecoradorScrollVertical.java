package ar.edu.ort;

//Clase decorador concreto
public class DecoradorScrollVertical extends DecoradorVentana {
	
    public DecoradorScrollVertical (ComponenteVisual ventanaDecorada) {
        super(ventanaDecorada);
    }
 
    public void dibujar() {
    	ventanaDecorada.dibujar();
    	dibujarScrollVertical();
    }
 
    private void dibujarScrollVertical() {
    	System.out.println("decoro con un scroll vertical");
    }
 
    public String getDescripcion() {
        return ventanaDecorada.getDescripcion() + ", incluyendo scroll vertical";
    }
}