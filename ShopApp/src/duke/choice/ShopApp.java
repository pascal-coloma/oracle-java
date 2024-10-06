/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

import java.util.Arrays;

/**
 *
 * @author colom
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double tax = 0.2, total = 0, totalNoTax;
        int measurement = 3;
        
        System.out.println("Welcome to Duke Choice Shop!");
        Customer c1 = new Customer("Pinky", "S");
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 15, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");
        
        Clothing[] items = {item1, item2,item3, item4};

        c1.addItems(items);
        
        System.out.println("Hi! " + c1.getName());
        System.out.println("------------------------------------");
        for (Clothing item : c1.getItems()) {
            System.out.println(item);
            System.out.println("------------------------------------");
        }
        System.out.println(" \nTotal payment: $" + c1.getTotalClothingCost());
        
        item1.setPrice(10.5);
//        totalNoTax = item1.getPrice() + item2.getPrice() * 2;
//        System.out.println("Pre tax: " + totalNoTax);
//        total = totalNoTax * tax;
//        total = totalNoTax + total;
//        System.out.println("Total: " + total);
        
    }
    
}
