package ar.edu.ort;

/**
 * the second concrete decorator which adds horizontal scrollbar functionality
 * @author MCUPO
 *
 */

class DecoradorBarraHorizontal extends DecoradorVentana {
    public DecoradorBarraHorizontal (ComponenteVisual decoratedWindow) {
        super(decoratedWindow);
    }
 
    public void draw() {
        decoratedWindow.draw();
        drawHorizontalScrollBar();
    }
 
    private void drawHorizontalScrollBar() {
        // draw the horizontal scrollbar
    	System.out.println("decoro con una horizontal scrollbar");
    }
 
    public String getDescription() {
        return decoratedWindow.getDescription() + ", including horizontal scrollbars";
    }
    
    /**
     * Este metodo es para mostrar como funciona la javadoc
     * @param p: variable que se pasa a entero
     * @return devuelve el entero como string
     * @throws Exception: se lanza esta excsdf......
     */
    public String getText(Integer p) throws Exception{
    	return null;
    }
    
}