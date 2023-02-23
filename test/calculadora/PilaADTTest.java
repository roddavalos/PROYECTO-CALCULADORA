/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora;

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
public class PilaADTTest {
    
    public PilaADTTest() {
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
     * Test of push method, of class PilaADT.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object dato = null;
        PilaADT instance = new PilaADTImpl();
        instance.push(dato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class PilaADT.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        PilaADT instance = new PilaADTImpl();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class PilaADT.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        PilaADT instance = new PilaADTImpl();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class PilaADT.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        PilaADT instance = new PilaADTImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    public class PilaADTImpl<T> implements PilaADT<T> {

        public void push(T dato) {
        }

        public T pop() {
            return null;
        }

        public T peek() {
            return null;
        }

        public boolean isEmpty() {
            return false;
        }
    }
    
}
