
class Vehicle {
    String vehicleNumber, ownerName, vehicleType;

    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void display() {
        System.out.println(vehicleNumber + " " + ownerName);
    }

    public double fuelCost(double km) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fuelCost'");
    }

    public void displayInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayInfo'");
    }
}

public class SmartParkingManagement {

    static void displayCars(Vehicle[] v) {
        for (Vehicle x : v)
            if (x.vehicleType.equalsIgnoreCase("Car"))
                x.display();
    }

    static void displayBikes(Vehicle[] v) {
        for (Vehicle x : v)
            if (x.vehicleType.equalsIgnoreCase("Bike"))
                x.display();
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[10];

        for (int i=0;i<10;i++) {
            vehicles[i] = new Vehicle(
                "UP"+(100+i),
                "Owner"+(i+1),
                i%2==0 ? "Car":"Bike"
            );
        }

        System.out.println("Cars:");
        displayCars(vehicles);

        System.out.println("Bikes:");
        displayBikes(vehicles);
    }
}
