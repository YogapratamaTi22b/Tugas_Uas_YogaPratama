import java.util.ArrayList;

public class SalesReport {
    // Encapsulated fields
    private ArrayList<Sale> sales;

    // Encapsulated constructor
    public SalesReport() {
        sales = new ArrayList<Sale>();
    }

    // Encapsulated methods
    public void addSale(Sale sale) {
        sales.add(sale);
    }

    public double getTotalSales() {
        double totalSales = 0;
        for (Sale sale : sales) {
            totalSales += sale.getTotalPrice();
        }
        return totalSales;
    }

    public void printSalesReport() {
        System.out.println("Sales Report:");
        System.out.printf("Total Sales: %.2f%n", getTotalSales());
        System.out.println("Sales by Item:");
        for (Sale sale : sales) {
            System.out.printf("%s (%d @ %.2f): %.2f%n", sale.getSellable().getName(), sale.getQuantity(), sale.getSellable().getPrice(), sale.getTotalPrice());
        }
    }
}