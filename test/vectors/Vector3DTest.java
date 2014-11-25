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
public class Vector3DTest {
    
    public Vector3DTest() {
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
     * Test of length method, of class Vector3D.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        Vector3D instance = new Vector3D(0.0,0.0,0.0);
        double expResult = 0.0;
        double result = instance.length();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of add method, of class Vector3D.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Vector3D anotherVector = new Vector3D(2.0,0.0,0.0);
        Vector3D instance = new Vector3D(4.0,3.0,0.0);
        Vector3D expResult = new Vector3D(6.0,3.0,0);
        Vector3D result = instance.add(anotherVector);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of multiplyByScalar method, of class Vector3D.
     */
    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = -5.0;
        Vector3D instance = new Vector3D(5.0,6.0,7.0);
        Vector3D expResult = new Vector3D(-25.0,-30.0,-35.0);
        Vector3D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of dotProduct method, of class Vector3D.
     */
    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector3D anotherVector = new Vector3D(2.0,2.0,2.0);
        Vector3D instance = new Vector3D(-1.0,0.0,1.0);
        double expResult = 0.0;
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
   
    }

    /**
     * Test of crossProduct method, of class Vector3D.
     */
    @Test
    public void testCrossProduct() {
        System.out.println("crossProduct");
        Vector3D anotherVector = new Vector3D(2.0,-1.0,5.0);
        Vector3D instance = new Vector3D(10.0,6.0,-6.0);
        Vector3D expResult = new Vector3D(24.0,-62.0,-22.0);
        Vector3D result = instance.crossProduct(anotherVector);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Vector3D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vector3D instance = new Vector3D(5.0,3.0,1.0);
        String expResult = "[5.0, 3.0, 1.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class Vector3D.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = new Vector3D(3.0,4.0,4.0);
        Vector3D instance = new Vector3D(3.0,4.0,4.0);
        boolean expResult = true;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
      
    }
    
}
