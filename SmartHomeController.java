package Week4_Controller;

public class SmartHomeController {

    private static SmartHomeController instance = null;

    private boolean lightsOn;
    private int currentTemperature;
    private boolean securityArmed;

    private SmartHomeController() {
        lightsOn = false;
        currentTemperature = 22;
        securityArmed = false;
    }

    public static SmartHomeController getInstance() {
        if (instance == null) {
            synchronized (SmartHomeController.class) {
                if (instance == null) {
                    instance = new SmartHomeController();
                }
            }
        }
        return instance;
    }

    public void turnOnlights() {
        lightsOn = true;
        System.out.println("Lights on");
    }

    public void turnOfflights() {
        lightsOn = false;
        System.out.println("Lights off");
    }

    public void armSecurity() {
        securityArmed = true;
        System.out.println("Security armed");
    }

    public void disarmSecurity() {
        securityArmed = false;
        System.out.println("Security disarmed");
    }

    public void setTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void displayStatus() {
        if (lightsOn) {
            System.out.println("Lights ON.");
        }
        if (!lightsOn) {
            System.out.println("Lights OFF.");
        }
        if (securityArmed) {
            System.out.println("Security is armed.");
        }
        if (!securityArmed) {
            System.out.println("Security is disarmed .");
        }
        System.out.println("The temperature is:" + currentTemperature);
    }
}