
/**
 * Write a description of class Inventory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Inventory {
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Inventory
     */
    private List<Object> guitars;
    public Inventory()
    {
        // initialise instance variables
        this.guitars = new LinkedList<Object>();
    }
    public void addGuitar(Guitar guitar) {
        // 
        guitars.add(guitar);
    }
    public int getLength() {
        return guitars.size();
    }
    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }
    
    public Guitar search(Guitar guitar) {
        for(Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar machingGuitar = (Guitar)i.next();
            if (!guitar.getBuilder().equals(machingGuitar.getBuilder())) {
                continue;
            } else if (!guitar.getModel().equals(machingGuitar.getModel())){
                continue;
            } else if (!guitar.getType().equals(machingGuitar.getType())) {
                continue;
            } else if (!guitar.getBackWood().equals(machingGuitar.getBackWood())) {
                continue;
            } else if (!guitar.getTopWood().equals(machingGuitar.getTopWood())){
                continue;
            }
            return machingGuitar;
        }
        return null;
    }
}
