package ar.edu.ort;

public class DecoradorBordeNegro extends DecoradorVentana {

    public DecoradorBordeNegro (ComponenteVisual ventanaDecorada) {
        super(ventanaDecorada);
    }
 
    public void dibujar() {
    	ventanaDecorada.dibujar();
    	dibujarBordeNegro();
    }
 
    private void dibujarBordeNegro() {
    	System.out.println("decoro con un borde negro");
    }
 
    public String getDescripcion() {
        return ventanaDecorada.getDescripcion() + ", incluyendo borde negro";
    }
}