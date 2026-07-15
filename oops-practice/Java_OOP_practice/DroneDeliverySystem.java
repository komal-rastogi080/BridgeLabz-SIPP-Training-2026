
class Drone {
    String droneId;
    int batteryPercentage;
    static String companyName = "SkyLogistics";

    Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    void startDelivery() {
        System.out.println(droneId + " started delivery");
    }

    void displayStatus() {
        System.out.println(droneId + " Battery: " + batteryPercentage + "% Company: " + companyName);
    }
}

public class DroneDeliverySystem {
    public static void main(String[] args) {
        Drone d1 = new Drone("D1",90);
        Drone d2 = new Drone("D2",80);

        d1.startDelivery();
        d2.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
    }
}
