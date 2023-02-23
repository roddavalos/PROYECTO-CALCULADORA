/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of infiApost method, of class Calculadora.
     */
    @Test
    public void testInfiApost() {
        System.out.println("infiApost");
        String operacion = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = Calculadora.infiApost(operacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of revisaParentesis method, of class Calculadora.
     */
    @Test
    public void testRevisaParentesis() {
        System.out.println("revisaParentesis");
        String operacion = "";
        boolean expResult = false;
        boolean result = Calculadora.revisaParentesis(operacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of revisa method, of class Calculadora.
     */
    @Test
    public void testRevisa() {
        System.out.println("revisa");
        String operacion = "";
        boolean expResult = false;
        boolean result = Calculadora.revisa(operacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pruebaParentesisSinOperador method, of class Calculadora.
     */
    @Test
    public void testPruebaParentesisSinOperador() {
        System.out.println("pruebaParentesisSinOperador");
        String operacion = "";
        boolean expResult = false;
        boolean result = Calculadora.pruebaParentesisSinOperador(operacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evaluarPostfijo method, of class Calculadora.
     */
    @Test
    public void testEvaluarPostfijo() {
        System.out.println("evaluarPostfijo");
        ArrayList<String> postfijo = null;
        String expResult = "";
        String result = Calculadora.evaluarPostfijo(postfijo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiar method, of class Calculadora.
     */
    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        Calculadora instance = new Calculadora();
        instance.limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaFinal method, of class Calculadora.
     */
    @Test
    public void testCalculaFinal() throws Exception {
        System.out.println("calculaFinal");
        String cadena = "";
        Calculadora instance = new Calculadora();
        String expResult = "";
        String result = instance.calculaFinal(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
