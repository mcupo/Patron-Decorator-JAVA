package ar.edu.ort;

/**
 * abstract decorator class - note that it implements Window
 * @author MCUPO
 *
 */
abstract class DecoradorVentana implements Ventana {
    protected Ventana decoratedWindow; // the Window being decorated
 
    public DecoradorVentana (Ventana decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }
    public void draw() {
        decoratedWindow.draw();
    }
}