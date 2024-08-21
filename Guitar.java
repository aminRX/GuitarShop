
/**
 * Write a description of class Guitar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guitar
{
    // instance variables - replace the example below with your own
    private double price;
    private String serialNumber, builder, model, type, backWood, topWood;

    /**
     * Constructor for objects of class Guitar
     */
    public Guitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood)
    {
        // initialise instance variables
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    
    public String getTest () {
        return ""
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public double getPrice() {
        return price;
    }
    public String getBuilder() {
        return builder;
    }
    public String getModel() {
        return model;
    }
    public String getType() {
        return type;
    }
    public String getBackWood() {
        return backWood;
    }
    public String getTopWood() {
        return topWood;
    }
}
