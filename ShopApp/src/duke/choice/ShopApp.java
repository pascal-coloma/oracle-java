/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

/**
 *
 * @author colom
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tax = 0.2, total;
        System.out.println("Welcome to Duke Choice Shop!");
        Customer c1 = new Customer("Pinky");
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        
        System.out.println("Hi! " + c1.getName());
        System.out.println("Purchase details");
        System.out.println(item1.toString());
        System.out.println(item2.toString());
        System.out.println("------------------------------------");
        System.out.println("Pre tax: " + (item1.getPrice()  + item2.getPrice()* 2) );
        total = (item1.getPrice() + item2.getPrice() * 2) * (1 + tax);
        System.out.println("Total: " + total);
        
    }
    
}
