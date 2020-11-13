
package com.mycompany.chapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class StringOpsTest {
    
    public StringOpsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getFirstCharacter method, of class StringOps.
     */
    @Test
    public void testGetFirstCharacter() {
        System.out.println("getFirstCharacter");
        String txt = "Borrocudo";
        char expResult = 'B';
        char result = StringOps.getFirstCharacter(txt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastCharacter method, of class StringOps.
     */
    @Test
    public void testGetLastCharacter() {
        System.out.println("getLastCharacter");
        String txt = "Borrocudo";
        char expResult = 'o';
        char result = StringOps.getLastCharacter(txt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnyCharacter method, of class StringOps.
     */
    @Test
    public void testGetAnyCharacter() {
        System.out.println("getAnyCharacter");
        String txt = "Borrocudo";
        int i = 2;
        char expResult = 'r';
        char result = StringOps.getAnyCharacter(txt, i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
