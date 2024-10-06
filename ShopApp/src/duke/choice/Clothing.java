/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author colom
 */
public class Clothing {
    
    private String description, size;
    private double price;
    private final int MIN_PRICE = 10;
    private final double TAX_RATE = 0.2;
    
    public Clothing() {
    }

    public Clothing(String description, double price, String size) {
        this.description = description;
        setPrice(price);
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < MIN_PRICE) {
            System.out.println("Price can't be smaller than: " + MIN_PRICE);
        } else {
            this.price = price + price * TAX_RATE;
        }
        
    }

    @Override
    public String toString() {
        return "Description: " + description + "\nSize: " + size + "\nPrice: " + price;
    }
    
    

   
    
}
