package OOP_review;

public class Order {
    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;
    private double totalAmount;

    //Setting totalAmount to zero everytime a new order is started
    public Order() {
        this.totalAmount = 0.0;
    }
    //Setters
    public void addItem1(MenuItem item) {
        this.item1 = item;
    }
    public void addItem2(MenuItem item) {
        this.item2 = item;
    }
    public void addItem3(MenuItem item) {
        this.item3 = item;
    }

    //Method to calculate the total price using getters
    public void calculateTotal() {
        totalAmount = 0.0;
        if (item1 != null) {
            totalAmount += item1.getPrice();
        }
        if (item2 != null) {
            totalAmount += item2.getPrice();
        }
        if (item3 != null) {
            totalAmount += item3.getPrice();
        }
    }

    //Method to print the Order, if statement to prevent any bug in case of the order has just two itens
    public void displayOrderDetails() {
        System.out.println("Order Details:");
        if (item1 != null) {
            item1.displayItemInfo();
        }
        if (item2 != null) {
            item2.displayItemInfo();
        }
        if (item3 != null) {
            item3.displayItemInfo();
        }
        System.out.println("Total Amount: $" + totalAmount);
    }
}
