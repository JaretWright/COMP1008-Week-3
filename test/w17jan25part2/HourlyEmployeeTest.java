/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17jan25part2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JWright
 */
public class HourlyEmployeeTest {
    
    public HourlyEmployeeTest() {
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
     * Test of setHourlyRate method, of class HourlyEmployee.
     */
    @Test
    public void testSetHourlyRate() {
        System.out.println("setHourlyRate");
        double rate = 0.0;
        HourlyEmployee instance = null;
        instance.setHourlyRate(rate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHoursWorked method, of class HourlyEmployee.
     */
    @Test
    public void testAddHoursWorked() {
        System.out.println("addHoursWorked");
        double newHoursWorked = 0.0;
        HourlyEmployee instance = null;
        instance.addHoursWorked(newHoursWorked);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHourlyRate method, of class HourlyEmployee.
     */
    @Test
    public void testGetHourlyRate() {
        System.out.println("getHourlyRate");
        HourlyEmployee instance = null;
        double expResult = 0.0;
        double result = instance.getHourlyRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoursWorked method, of class HourlyEmployee.
     */
    @Test
    public void testGetHoursWorked() {
        System.out.println("getHoursWorked");
        HourlyEmployee instance = null;
        double expResult = 0.0;
        double result = instance.getHoursWorked();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPayCheque method, of class HourlyEmployee.
     */
    @Test
    public void testGetPayCheque() {
        System.out.println("getPayCheque");
        HourlyEmployee instance = null;
        PayCheque expResult = null;
        PayCheque result = instance.getPayCheque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaymentAmount method, of class HourlyEmployee.
     */
    @Test
    public void testGetPaymentAmount() {
        System.out.println("getPaymentAmount");
        HourlyEmployee instance = null;
        double expResult = 0.0;
        double result = instance.getPaymentAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
