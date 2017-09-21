/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import Exercicios.Pessoa;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paulo Gouveia
 */
public class PessoaTest {

    Pessoa p;

    public PessoaTest() {
    }

    @Before
    public void setUp() {
        p = new Pessoa();
    }

    /**
     * Test of inseriPessoa method, of class Pessoa.
     */
    @Test
    public void testInseriPessoa() {
     String resultado = p.inseriPessoa("Paulo","Cezar");
     assertEquals("Paulo Cezar",resultado);
    }

}
