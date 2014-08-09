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
public class CorrienteSerieTest {
    
    public CorrienteSerieTest() {
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
     * Test of corrienteenserie method, of class CorrienteSerie.
     */
    @Test
    public void testCorrienteenserie() {
        System.out.println("corrienteenserie");
        double r1 = 5.0;
        double r2 = 5.0;
        double r3 = 5.0;
        double voltaje = 10.0;
        CorrienteSerie instance = new CorrienteSerie();
        double expResult = 0.6666666666666666;
        double result = instance.corrienteenserie(r1, r2, r3, voltaje);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
