
public class Vehicle {
    public void startEngine() {
        System.out.println("Starting the vehicle's engine...");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with key ignition.");
    }
}

class Motorcycle extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with kick start.");
    }
}

class VehicleTest {
    public static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }

    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Motorcycle();
        System.out.println("Testing Car:");
        vehicleTestDrive(myCar);

        System.out.println("\nTesting Motorcycle:");
        vehicleTestDrive(myBike);
    }
}
