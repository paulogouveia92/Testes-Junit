/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import Exercicios.Triangulo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paulo Gouveia
 */
public class TrianguloTest {
    Triangulo t;
    public TrianguloTest() {
    }
    
    @Before
    public void setUp() {
        
        t = new Triangulo();
    }

    /**
     * Test of getResultadoTriangulo method, of class Triangulo.
     */
    @Test
    public void testGetResultadoTriangulo() {
        
        
        String resultado1 = "Isoceles";
        String resultado2 = "Equilátero";
        String resultado3 = "Os três lados são diferentes";
        
        assertEquals(resultado2,t.ResultadoTriangulo(2,2,2,"Equilátero"));
        
        assertEquals(resultado1,t.ResultadoTriangulo(2, 3, 2,"Isoceles"));
        assertEquals(resultado1,t.ResultadoTriangulo(1, 2, 2,"Isoceles"));
        assertEquals(resultado1,t.ResultadoTriangulo(1, 1, 2, "Isoceles"));
        assertEquals (resultado3,t.ResultadoTriangulo(1,2, 3,"Os três lados são diferentes" ));
        
      
    }
    
}
