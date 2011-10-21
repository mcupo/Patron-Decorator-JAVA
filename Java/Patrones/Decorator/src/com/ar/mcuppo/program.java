package com.ar.mcuppo;

public class program {

	/**
	 * Main
	 * Para generar la javadoc: Project->Generate JavaDoc, en JavaDocCommand buscar el exe: javadoc.exe.
	 * @param args
	 */
	public static void main(String[] args) 
	{
        // create a decorated Window with horizontal and vertical scrollbars
        Window decoratedWindow = new HorizontalScrollBarDecorator (new VerticalScrollBarDecorator(new SimpleWindow()));
        decoratedWindow.draw();
	}

}
