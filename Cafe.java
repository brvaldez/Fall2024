package OOP_review;
public class Cafe {
    private MenuItem menuItem1;
    private MenuItem menuItem2;
    private MenuItem menuItem3;
    private Order currentOrder;

    public Cafe() {
        this.currentOrder = new Order();
    }
    public void addMenuItem1(MenuItem item) {
        this.menuItem1 = item;
    }
    public void addMenuItem2(MenuItem item) {
        this.menuItem2 = item;
    }
    public void addMenuItem3(MenuItem item) {
        this.menuItem3 = item;
    }

    //Method to place the order
    public void placeOrder(Order order) {
        this.currentOrder = order;
        currentOrder.calculateTotal();
    }
    //Method to display items in Menu
    public void displayMenu() {
        System.out.println("Cafe Menu:");
        menuItem1.displayItemInfo();
        menuItem2.displayItemInfo();
        menuItem3.displayItemInfo();
    }
}
