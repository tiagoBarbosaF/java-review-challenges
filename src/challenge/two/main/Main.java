package challenge.two.main;

import challenge.two.models.CreditCard;
import challenge.two.models.Shopping;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter credit card limit: ");
        double limit = scanner.nextDouble();
        CreditCard card = new CreditCard(limit);

        int controlMenu = 0;

        while (controlMenu != 1) {
            System.out.print("\nEnter the name of item: ");
            String nameItem = scanner.next();

            System.out.print("\nEnter the value of item: ");
            double value = scanner.nextDouble();

            Shopping shopping = new Shopping(nameItem, value);
            boolean purchaseMade = card.addPurchase(shopping);

            if (purchaseMade) {
                System.out.println("\nPurchase Made.");
                System.out.println("Enter 1 to exit or 0 to continue.");
                controlMenu = scanner.nextInt();
            } else {
                System.out.println("\nInsufficient balance!");
                controlMenu = 1;
            }

            System.out.println("*".repeat(20));
            System.out.println("Purchases Made:\n");

//            card.getShoppingList().sort(Comparator.comparing(Shopping::getValue));
            Collections.sort(card.getShoppingList());
            card.getShoppingList().forEach(item -> System.out.printf("%s - R$ " +
                    "%.2f%n", item.getDescription(), item.getValue()));
            System.out.println("*".repeat(20));

            System.out.printf("%nCard balance: R$ %.2f%n", card.getBalance());
        }
    }
}
