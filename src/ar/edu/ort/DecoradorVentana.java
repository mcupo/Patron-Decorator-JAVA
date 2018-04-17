package ar.edu.ort;

/**
 * abstract decorator class - note that it implements Window
 * @author MCUPO
 *
 */
abstract class DecoradorVentana implements ComponenteVisual {
    protected ComponenteVisual decoratedWindow; // the Window being decorated
 
    public DecoradorVentana (ComponenteVisual decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }
    public void draw() {
        decoratedWindow.draw();
    }
}