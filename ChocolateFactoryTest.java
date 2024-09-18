package Week4_Chocolate;


public class ChocolateFactoryTest {
    public static void main(String [] args){
        ChocolateFactory boiler1 = ChocolateFactory.getInstance();

        boiler1.fill();
        boiler1.boil();
        boiler1.drain();
        boiler1.displayStatus();

        ChocolateFactory boiler2 = ChocolateFactory.getInstance();

        boiler2.drain();
        boiler2.boil();
        boiler2.fill();
        boiler2.displayStatus();
        
        System.out.println("Are both instances the same? " + (boiler1 == boiler2));
    }
}
