/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Victor Garcia Vera 2DAM
 */
public class MasGrandeTest {
    
    public MasGrandeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of max method, of class MasGrande.
     */
    @Test
    public void testMax() {
        System.out.println("* MasGrandeTest: testMax()");
        assertEquals(0, MasGrande.max(new int[]{}));
        assertEquals(5, MasGrande.max(new int[]{3,4,5}));
        assertEquals(1, MasGrande.max(new int[]{1}));
        assertEquals(5, MasGrande.max(new int[]{5,4,3}));
        assertEquals(5, MasGrande.max(new int[]{5,5,5}));
    }
    
}
