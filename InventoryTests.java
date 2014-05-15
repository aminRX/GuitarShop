import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InventoryTests.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InventoryTests
{
    /**
     * Default constructor for test class InventoryTests
     */
    private Inventory inventory;
    private Guitar guitar;
    
    @Before
    public void initialize() {
        inventory = new Inventory();
        guitar = new Guitar("V95693", 14.23, "fender", "strativastor", "electric", "Alder", "Alder");
        inventory.addGuitar(guitar);

    }
    
    @Test
    public void ItShouldAddGuitar() {
        assertEquals(1, inventory.getLength());
    }
    
    @Test
    public void ItShouldGetAGuitar() {
        assertEquals(guitar, inventory.getGuitar("V95693"));
    }

    @Test
    public void ItShouldSearchAGuitar() {
        assertEquals(guitar, inventory.search(guitar));
    }
    
}
