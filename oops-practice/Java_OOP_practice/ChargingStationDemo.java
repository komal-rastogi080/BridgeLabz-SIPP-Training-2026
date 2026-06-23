
class ChargingStation {
    static int totalStations = 0;
    static double electricityRate = 8.5;

    String stationId;
    double unitsConsumed;

    ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {
        System.out.println(stationId + " Bill: " + calculateBill());
    }
}

public class ChargingStationDemo {
    public static void main(String[] args) {
        ChargingStation[] s = {
            new ChargingStation("S1",50),
            new ChargingStation("S2",60),
            new ChargingStation("S3",40),
            new ChargingStation("S4",80),
            new ChargingStation("S5",100)
        };

        for (ChargingStation cs : s)
            cs.displayStationDetails();

        ChargingStation.electricityRate = 10;

        System.out.println("Updated Rate");
        for (ChargingStation cs : s)
            cs.displayStationDetails();
    }
}
