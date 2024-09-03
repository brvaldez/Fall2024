package OOP_review;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        MenuItem item1 = new MenuItem("Cappuccino", 3.50, "Beverage");
        MenuItem item2 = new MenuItem("Egg Muffin", 3.00, "Food");
        MenuItem item3 = new MenuItem("Chocolate Cake", 4.00, "Food");

        cafe.addMenuItem1(item1);
        cafe.addMenuItem2(item2);
        cafe.addMenuItem3(item3);

        cafe.displayMenu();

        Order order = new Order();
        order.addItem1(item1);
        order.addItem2(item2);
        //order.addItem3(item3);

        cafe.placeOrder(order);

        order.displayOrderDetails();
    }
}