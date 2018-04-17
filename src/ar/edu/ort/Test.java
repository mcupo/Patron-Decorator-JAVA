package ar.edu.ort;

public class Test {

	public static void main(String[] args) 
	{
        // create a decorated Window with horizontal and vertical scrollbars
        ComponenteVisual decoratedWindow = new DecoradorBarraHorizontal (new DecoradorBarraVertical(new VentanaSimple()));
        decoratedWindow.draw();
	}

}