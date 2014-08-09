/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 12
 */
public class CircunferenciaTest {
    
    public CircunferenciaTest() {
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
     * Test of CCircunferencia method, of class Circunferencia.
     */
    @Test
    public void testCCircunferencia() {
        System.out.println("CCircunferencia");
        double v1 = 5;
        Circunferencia instance = new Circunferencia();
        double expResult = 0.0;
        double result = instance.CCircunferencia(v1);
        assertEquals(expResult, result, 78.539981634);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
