package com.ar.mcuppo;

/**
 * abstract decorator class - note that it implements Window
 * @author MCUPO
 *
 */
abstract class WindowDecorator implements Window {
    protected Window decoratedWindow; // the Window being decorated
 
    public WindowDecorator (Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }
    public void draw() {
        decoratedWindow.draw();
    }
}