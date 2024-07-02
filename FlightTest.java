package coe528.lab1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author KabisanPararajasingam
 */
public class FlightTest {
    
    @Test
    public void testConstructor(){
        Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm", 100, 1000);
        
        assertNotNull(f);
        assertEquals(1030, f.getFlightNumber());
        assertTrue(f.getOrigin().equals("Toronto"));
        assertTrue(f.getDestination().equals("Kolkata"));
        assertTrue(f.getDepartureTime().equals("7:50pm"));
        assertEquals(100, f.getCapacity());
        assertEquals(100, f.getNumberOfSeatsLeft());
        assertEquals(1000,f.getOriginalPrice());
    }

 

    
    public FlightTest() {
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
     * Test of setFlightNumber method, of class Flight.
     */
         @Test
    public void testSetFlightNumber(){
        Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm",100, 1000);
        f.setFlightNumber(55);
        assertEquals(55, f.getFlightNumber());
    }
    
    @Test
    public void testGetFlightNumber(){
        Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm", 100, 1000);
      
        assertEquals(1030, f.getFlightNumber());
    }
    
    @Test
     public void testSetOrigin(){
        Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm",100, 1000);
        f.setOrigin("Vancouver");
        assertEquals("Vancouver", f.getOrigin());
     }
     
    @Test
    public void testGetOrigin(){
        Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm",100, 1000);
      
        assertEquals("Toronto", f.getOrigin());
    }
    
    @Test
     public void testSetDestination(){
        Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm", 100, 1000);
        f.setDestination("California");
        assertEquals("California", f.getDestination());
     }
    
    @Test
    public void testGetDestination(){
        Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm", 100, 1000);
      
        assertEquals("Kolkata", f.getDestination());
    }
    
    @Test
     public void testSetDepartureTime(){
        Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm", 100, 1000);
        f.setDepartureTime("8:00am");
        assertEquals("8:00am", f.getDepartureTime());
     }
    
    @Test
    public void testGetDepartureTime(){
        Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm", 100, 1000);
      
        assertEquals("7:50pm", f.getDepartureTime());
    }
    
    @Test
     public void testSetCapacity(){
        Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm",100, 1000);
        f.setCapacity(500);
        assertEquals(500, f.getCapacity());
     }
    
    @Test
    public void testGetCapacity(){
        Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm", 100, 1000);
      
        assertEquals(100, f.getCapacity());
    }
    
    @Test
     public void testSetNumberOfSeatsLeft(){
        Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm", 100, 1000);
        f.setNumberOfSeatsLeft(233);
        assertEquals(233, f.getNumberOfSeatsLeft());
     }
    
    @Test
    public void testGetNumberOfSeatsLeft(){
        Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm", 100, 1000);
      
        assertEquals(100, f.getNumberOfSeatsLeft());
    }
    
    @Test
     public void testSetOriginalPrice(){
        Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm", 100, 1000);
        f.setOriginalPrice(2100);
        assertEquals(2100, f.getOriginalPrice());
     }
    
    @Test
    public void testGetOriginalPrice(){
        Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm", 100, 1000);
      
        assertEquals(1000, f.getOriginalPrice());
    }
    
    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm", 100, 1000);
       
       assertTrue(f.bookASeat());
       assertEquals(99, f.getNumberOfSeatsLeft());
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
       Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm", 100, 1000);
        
        String expected = "Flight 1030, Toronto to Kolkata, 7:50pm, original price: 1000.0$";
        assertEquals(expected, f.toString());
        
    }
    
}
