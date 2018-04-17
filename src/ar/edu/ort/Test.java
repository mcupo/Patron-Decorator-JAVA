package ar.edu.ort;

public class Test {

	public static void main(String[] args) 
	{
        //Creo una ventana con barras scrolleables
        ComponenteVisual ventanaDecorada = new DecoradorScrollHorizontal (new DecoradorScrollVertical(new VentanaSimple()));
        ventanaDecorada.dibujar();
        System.out.println();
        
        //Creo una ventana con bordes negros y barra horizontal scrolleable
        ComponenteVisual ventanaDecorada2 = new DecoradorBordeNegro(new DecoradorScrollHorizontal(new VentanaSimple()));
        ventanaDecorada2.dibujar();
        System.out.println();
        
        //Creo una ventana con bordes negros
        ComponenteVisual ventanaDecorada3 = new DecoradorBordeNegro(new VentanaSimple());
        ventanaDecorada3.dibujar();
	}

}