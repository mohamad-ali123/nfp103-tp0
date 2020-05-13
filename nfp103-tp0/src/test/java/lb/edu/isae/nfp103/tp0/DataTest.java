/*
GNU LESSER GENERAL PUBLIC LICENSE V3.0 
https://www.gnu.org/licenses/lgpl-3.0.fr.html 
 */
package lb.edu.isae.nfp103.tp0;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Pascal Fares <pascal.fares at cofares.net>
 */
public class DataTest {
    
    public DataTest() {
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
     * Test of inc method, of class Data.
     */
    @Test
    public void testInc() {
        System.out.println("inc");
        Data instance = new Data();
        instance.inc();
        assertEquals(instance.toString(), "x=1");
    }

    /**
     * Test of dec method, of class Data.
     */
    @Test
    public void testDec() {
        System.out.println("dec");
        Data instance = new Data();
        instance.dec();
        assertEquals(instance.toString(), "x=-1");
    }

    /**
     * Test of toString method, of class Data.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Data instance = new Data();
        String expResult = "x=0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
