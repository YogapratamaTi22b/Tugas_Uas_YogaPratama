import java.util.ArrayList;

public class DailyDrugSales {
    // Encapsulated fields
    private ArrayList<Drug> drugs;
    private SalesReport salesReport;

    // Encapsulated constructor
    DailyDrugSales() {
        drugs = new ArrayList<Drug>();
        salesReport = new SalesReport();
    }

    // Encapsulated methods
    public void addDrug(Drug drug) {
        drugs.add(drug);
    }

    public void sellDrug(ISellable sellable, int quantity) {
        Sale sale = new Sale(sellable, quantity);
        salesReport.addSale(sale);
        System.out.printf("Sold %dunits of %s for %.2f%n", quantity, sellable.getName(), sale.getTotalPrice());
    }

    public void printSalesReport() {
        salesReport.printSalesReport();
    }

    public ISellable findSellableByName(String name) {
        for (Drug drug : drugs) {
            if (drug.getName().equalsIgnoreCase(name)) {
                return drug;
            }
        }
        return null;
    }
}