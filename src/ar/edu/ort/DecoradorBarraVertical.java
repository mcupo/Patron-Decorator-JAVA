package ar.edu.ort;

/**
 * the first concrete decorator which adds vertical scrollbar functionality
 * @author MCUPO
 *
 */
class DecoradorBarraVertical extends DecoradorVentana {
    public DecoradorBarraVertical (ComponenteVisual decoratedWindow) {
        super(decoratedWindow);
    }
 
    public void draw() {
        decoratedWindow.draw();
        drawVerticalScrollBar();
    }
 
    private void drawVerticalScrollBar() {
        // draw the vertical scrollbar
    	System.out.println("decoro con una vertical scrollbar");
    }
 
    public String getDescription() {
        return decoratedWindow.getDescription() + ", including vertical scrollbars";
    }
}