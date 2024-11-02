package src.task1;

import java.util.Scanner;
import src.task1.FoodItems.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(); 

        System.out.println("Welcome to Khaidai Bistro!");
        int choice;
        menu.display();

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Create a Combo");
            System.out.println("2. View Menu");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createCombo(scanner, menu);
                    break;
                case 2:
                    menu.display();
                    break;
                case 0:
                    System.out.println("Thank you for visiting Khaidai Bistro!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void createCombo(Scanner scanner, Menu menu) {
        // Prompting the user to enter the combo name
        System.out.print("Enter the name of the combo: ");
        String comboName = scanner.nextLine();
        Combos combo = new Combos(comboName); // Create a new Combo object with the given name
    
        // Displaying available commands for user interaction
        String command;
        System.out.println("Available commands: Add [item], Remove [item], Free [item], Discount [percentage], Done");
    
        // Loop to accept user commands until "Done" is entered
        do {
            System.out.print("Enter command: ");
            command = scanner.nextLine();
            String[] parts = command.split(" ", 2); // Splitting the command into action and parameter
            String action = parts[0].toLowerCase(); // Normalizing action to lowercase for easy comparison
    
            // Handling different command types
            switch (action) {
                case "add":
                    if (parts.length > 1) {
                        String item = parts[1].toLowerCase();
                        if (item.equals("burger") || item.equals("fries") || item.equals("drink") || item.equals("wedges") || item.equals("shawarma")) {
                            combo.addItem(parts[1]); 
                        } else {
                            combo.addComponent(menu,item);
                        }
                    } else {
                        System.out.println("Please specify an item to add.");
                    }
                    break;
                case "remove":
                    if (parts.length > 1) {
                        combo.removeComponent(parts[1]);// Remove item from the combo
                    } else {
                        System.out.println("Please specify an item to remove.");
                    }
                    break;
                case "free":
                    if (parts.length > 1) {
                        combo.addFreeItem(parts[1]); // Add a free item to the combo
                    } else {
                        System.out.println("Please specify an item to mark as free.");
                    }
                    break;
                case "discount":
                    if (parts.length > 1) {
                        try {
                            double discount = Double.parseDouble(parts[1]); // Parse discount percentage
                            combo.setDiscountPercentage(discount); // Apply discount to the combo
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid discount value. Please enter a valid number.");
                        }
                    } else {
                        System.out.println("Please specify a discount percentage.");
                    }
                    break;
                case "done":
                    menu.addCombo(combo); // Save the combo to the menu
                    System.out.println("Combo created successfully:");
                    combo.display(); // Display the combo details
                    break;
                default:
                    System.out.println("Unknown command. Try again.");
            }
        } while (!command.equalsIgnoreCase("done"));
    }
    
}
