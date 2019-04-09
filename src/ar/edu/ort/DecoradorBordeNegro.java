package ar.edu.ort;

public class DecoradorBordeNegro extends DecoradorVentana {

    public DecoradorBordeNegro (ComponenteVisual ventanaDecorada) {
        super(ventanaDecorada);
    }
 
    public void dibujar() {
    	super.dibujar();
    	dibujarBordeNegro();
    }
 
    private void dibujarBordeNegro() {
    	System.out.println("decoro con un borde negro");
    }
 
    public String getDescripcion() {
        return super.getDescripcion() + ", incluyendo borde negro";
    }
}