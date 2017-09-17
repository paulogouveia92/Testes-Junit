
package Testes;

import Exercicios.Matematica;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paulo Gouveia
 */
public class MatematicaTest {
    private Matematica m;
    public MatematicaTest() {
       
    }
    
    @Before
    public void setUp() {
         m = new Matematica();
    }
    
    
    @Test
    public void testSubtrair() {
        assertEquals(6,m.Subtrair(6,0));
   
    }

    @Test
    public void testSoma() {
      assertEquals(20,m.Soma(10,10));  
    }
    
}
