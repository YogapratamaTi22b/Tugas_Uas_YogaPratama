
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DailyDrugSales app = new DailyDrugSales();
        app.addDrug(new Drug("Aspirin", 5.0));
        app.addDrug(new Drug("Ibuprofen", 7.0));
        app.addDrug(new Drug("Acetaminophen", 6.0));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 'sell' to sell a drug, 'report' to print the sales report, or 'quit' to exit");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("sell")) {
                System.out.println("Enter the name of the drug and the quantity to sell");
                String drugName = scanner.nextLine();
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                ISellable sellable = app.findSellableByName(drugName);
                if (sellable != null) {
                    app.sellDrug(sellable, quantity);
                } else {
                    System.out.println("Drug not found");
                }
            } else if (command.equalsIgnoreCase("report")) {
                app.printSalesReport();
            } else if (command.equalsIgnoreCase("quit")) {
                break;
            }
        }
        scanner.close();
    }
}
