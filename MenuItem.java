package OOP_review;

public class MenuItem {
    private String name;
    private double price;
    private String category;

   //Constructor for each item in the Menu
    public MenuItem(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }
    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    //Method to display each item informations
    public void displayItemInfo() {
        System.out.println("Item Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Category: " + category);
    }
}
