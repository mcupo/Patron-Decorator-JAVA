package com.ar.mcuppo;

/**
 * the first concrete decorator which adds vertical scrollbar functionality
 * @author MCUPO
 *
 */
class VerticalScrollBarDecorator extends WindowDecorator {
    public VerticalScrollBarDecorator (Window decoratedWindow) {
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