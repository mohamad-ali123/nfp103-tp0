/*
GNU LESSER GENERAL PUBLIC LICENSE V3.0 
https://www.gnu.org/licenses/lgpl-3.0.fr.html 
 */
package lb.edu.isae.nfp103.tp0;

import static lb.edu.isae.nfp103.tp0.Main.creerEtLance;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

/**
 *
 * @author Pascal Fares <pascal.fares at cofares.net>
 */
public class MainTest {
    Data d;
    Thread[] t;
    public MainTest() {
        d=new Data();
        t=Main.creerEtLance(d,1000);
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
     * Test of creerEtLance method, of class Main.
     */
    @Test
    @Execution(ExecutionMode.CONCURRENT)
    public void testInc() {
        t[0].start(); 
        //assertEquals("x=1000", d.toString());
    }
    @Test
    @Execution(ExecutionMode.CONCURRENT)   
    public void testDec() {
        t[1].start();
        //assertEquals("x=-1000", d.toString());
    }

    /**
     * Test of main method, of class Main.
     */

    @Test
    @Execution(ExecutionMode.CONCURRENT)
    public void testMain() throws InterruptedException {
        System.out.println("comme main...");

        //t[0].join();t[1].join();
        assertEquals("x=0", d.toString());
    }
    
}
