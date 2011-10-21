import junit.framework.Assert;

import org.junit.Test;


import com.ar.mcuppo.SimpleWindow;
import com.ar.mcuppo.Window;

/**
 * Pruebas con JUnit
 * @author MCUPO
 *
 */

public class MainTest {

	@Test
	public void testThis(){
		Assert.assertEquals( "tienen que ser iguales", "A", "B");
	}
	
	@Test
	public void otro(){
		 Window decoratedWindow = new SimpleWindow();
	        decoratedWindow.draw();
	 
	        Assert.assertEquals("simple window", decoratedWindow.getDescription());
	        // print the Window's description
	        //System.out.println(decoratedWindow.getDescription());
	}
	
}
