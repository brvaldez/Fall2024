package Week4_Controller;

public class SmartHomeTest{
    public static void main(String [] args){
        SmartHomeController controller1 = SmartHomeController.getInstance();

        controller1.turnOnlights();
        controller1.armSecurity();
        controller1.setTemperature(19);
        controller1.displayStatus();

        SmartHomeController controller2 = SmartHomeController.getInstance();

        controller2.turnOfflights();
        controller2.disarmSecurity();
        controller2.setTemperature(24);
        controller2.displayStatus();

        System.out.println("Are both instances the same? " + (controller1 == controller2));
    }
}