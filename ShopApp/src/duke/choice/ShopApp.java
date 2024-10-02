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
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");
        
        Clothing[] items = {item1, item2,item3, item4};
   
        System.out.println("Hi! " + c1.getName());
        switch (measurement) {
            case 1, 2, 3 -> c1.setSize("S");
            case 4,5,6 -> c1.setSize("M");
            case 7,8,9 -> c1.setSize("L");
            default -> c1.setSize("X");
        }
        System.out.println("Customer size is: " + c1.getSize());
        
        for (Clothing item : items) {
            System.out.println("------------------------------------");
            if (item.getSize().equalsIgnoreCase(c1.getSize())) {
                System.out.println( item.getDescription() + "\nOriginal price: $" + item.getPrice());
                total += item.getPrice() * (1 + tax);
                
                if (total > 15) {
                    break;
                }
            } else {
                System.out.println(item.getDescription() + " don't match the customer size");
            }
        }
        System.out.println("\nTotal payment: $"+ total);
  
        System.out.println("------------------------------------");
//        totalNoTax = item1.getPrice() + item2.getPrice() * 2;
//        System.out.println("Pre tax: " + totalNoTax);
//        total = totalNoTax * tax;
//        total = totalNoTax + total;
//        System.out.println("Total: " + total);
        
    }
    
}
