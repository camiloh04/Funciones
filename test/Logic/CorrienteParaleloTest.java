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
public class CorrienteParaleloTest {
    
    public CorrienteParaleloTest() {
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
     * Test of corrienteenparalelo method, of class CorrienteParalelo.
     */
    @Test
    public void testCorrienteenparalelo() {
        System.out.println("corrienteenparalelo");
        double r1 = 5.0;
        double r2 = 5.0;
        double r3 = 5.0;
        double voltaje = 10.0;
        CorrienteParalelo instance = new CorrienteParalelo();
        double expResult = 16.666666666666664;
        double result = instance.corrienteenparalelo(r1, r2, r3, voltaje);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
