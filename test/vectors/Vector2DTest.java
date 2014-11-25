/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mitrut Maciej "Sorezin"
 */
public class Vector2DTest {
    
    public Vector2DTest() {
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
     * Test of length method, of class Vector2D.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        Vector2D instance = new Vector2D(5.0,8.0);
        double expResult = 5.0;
        double result = instance.length();
        assertEquals(expResult, result, 5.0);
      
    }

    
    @Test
    public void testAdd() {
        System.out.println("add");
        Vector2D anotherVector = new Vector2D(6.0,2.0);
        Vector2D instance = new Vector2D(14.0,6.0);
        Vector2D expResult = new Vector2D(20.0,8.0);
        Vector2D result = instance.add(anotherVector);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of multiplyByScalar method, of class Vector2D.
     */
    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 5.0;
        Vector2D instance = new Vector2D(5.0, 8.0);
        Vector2D expResult = new Vector2D(25.0, 40.0);
        Vector2D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of dotProduct method, of class Vector2D.
     */
    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector2D anotherVector = new Vector2D(5.0,7.0);
        Vector2D instance = new Vector2D(3.0,4.0);
        double expResult = 7.0;
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 43.0);
        
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Vector2D instance = new Vector2D(3.0,-5.0);
        String expResult = "[3.0, -5.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
    
    }

  
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = new Vector2D(6,9);
        Vector2D instance = new Vector2D(6,9);
        boolean expResult = true;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
       
    }
    
}
