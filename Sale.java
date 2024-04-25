public class Sale {
    // Encapsulated fields
    private ISellable sellable;
    private int quantity;
    private double totalPrice;

    // Encapsulated constructor
    public Sale(ISellable sellable, int quantity) {
        this.sellable = sellable;
        this.quantity = quantity;
        this.totalPrice = sellable.getPrice() * quantity;
    }

    // Encapsulated getters and setters
    public ISellable getSellable() {
        return sellable;
    }

    public void setSellable(ISellable sellable) {
        this.sellable = sellable;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}