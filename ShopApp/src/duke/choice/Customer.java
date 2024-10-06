/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

import java.util.ArrayList;

/**
 *
 * @author colom
 */
public class Customer {

    private String name, size;
    private Clothing[] items;

    public void addItems(Clothing[] someItems) {
        items = someItems;
    }

    public double getTotalClothingCost() {
        double total = 0.0;
        
        for (Clothing item : items) {
            //System.out.println("Item: " + item.getDescription() + "," + item.getPrice() + "," + item.getSize());
            total += item.getPrice();
        }
        return total;
    }
    
    public Clothing[] getItems(){
        return items;
        
    }
    public Customer(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1, 2, 3 ->
                this.size = "S";
            case 4, 5, 6 ->
                this.size = "M";
            case 7, 8, 9 ->
                this.size = "L";
            default ->
                this.size = "X";
        }
        System.out.println("Customer size is: " + size);
    }

    @Override
    public String toString() {
        return "Customer \nName: " + name + "\nSize: " + size;
    }

}
