package Week4_Chocolate;

public class ChocolateFactory {
    private static ChocolateFactory instance = null;

    private boolean empty;
    private boolean boiled;

    private ChocolateFactory() {
        empty = true;
        boiled = false;
    }

    public static ChocolateFactory getInstance() {
        if (instance == null) {
            synchronized (ChocolateFactory.class) {
                if (instance == null) {
                    instance = new ChocolateFactory();
                }
            }
        }
        return instance;
    }
    public void fill(){
        if (empty == true){
            empty = false;
            System.out.println("Filling the boiler...");
        }
        else {
            System.out.println("Boiler is empty.");
        }
    }
    public void boil(){
        if (!empty){
            boiled = true;
            System.out.println("Boiling the mixture...");
        }
        else {
            System.out.println("You cannot boil an empty boiler.");
        }
    }
    public void drain(){
        if (!boiled){
            System.out.println("The mixture is not boiled yet.");
        }
        else if (empty) {
            System.out.println("Boiler is empty.");
        }
        else {
            empty = true;
            System.out.println("Draining the boiler...");
        }
    }
    public void displayStatus(){
        if (empty){
            System.out.println("Boiler is empty.");
        }
        if (!empty){
            System.out.println("Boiler is full.");
        }
        if (boiled){
            System.out.println("Mixture is boiled.");
        }
        if (!boiled){
            System.out.println("Mixture is waiting to be boiled.");
        }
    }
}
