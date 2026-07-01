import java.util.*;

public class SmartParkingSlotManager {
    private ArrayList<String> parkedVehicles = new ArrayList<>();

    public boolean vehicleEnter(String regNumber) {
        if (parkedVehicles.contains(regNumber)) {
            System.out.println("Vehicle " + regNumber + " is already parked.");
            return false;
        }
        parkedVehicles.add(regNumber);
        System.out.println("Vehicle " + regNumber + " has entered the parking area.");
        return true;
    }

    public boolean vehicleExit(String regNumber) {
        if (parkedVehicles.remove(regNumber)) {
            System.out.println("Vehicle " + regNumber + " has exited the parking area.");
            return true;
        } else {
            System.out.println("Vehicle " + regNumber + " not found in parking area.");
            return false;
        }
    }

    public boolean searchVehicle(String regNumber) {
        if (parkedVehicles.contains(regNumber)) {
            System.out.println("Vehicle " + regNumber + " is currently parked.");
            return true;
        } else {
            System.out.println("Vehicle " + regNumber + " is not parked here.");
            return false;
        }
    }

    public void displayParkedVehicles() {
        System.out.println("\n--- Currently Parked Vehicles ---");
        if (parkedVehicles.isEmpty()) {
            System.out.println("No vehicles currently parked.");
        } else {
            for (String v : parkedVehicles) {
                System.out.println(v);
            }
        }
        System.out.println("Total occupied slots: " + parkedVehicles.size());
    }

    public static void main(String[] args) {
        SmartParkingSlotManager manager = new SmartParkingSlotManager();

        manager.vehicleEnter("UP16AB1234");
        manager.vehicleEnter("DL8CAF5678");
        manager.vehicleEnter("MH12XY9999");
        manager.vehicleEnter("UP16AB1234"); // duplicate entry attempt

        System.out.println();
        manager.searchVehicle("DL8CAF5678");
        manager.searchVehicle("RJ14ZZ0000");

        System.out.println();
        manager.vehicleExit("MH12XY9999");
        manager.vehicleExit("KA05QW1111"); // not parked

        manager.displayParkedVehicles();
    }
}
