public class VehicleTest {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Car("Nissan", 60, 8, false);
        vehicles[1] = new Car("KIA Picanto", 30, 5, false);
        vehicles[2] = new Car("Toyota", 80, 10, false);
        vehicles[3] = new Truck("Truck 1", 200, 20, false, 80);
        vehicles[4] = new Truck("Truck 2", 250, 25, false, 200);

        printInfo(vehicles);

        vehicles[0] = new Car("Nissan", 60, 8, true);
        vehicles[1] = new Car("KIA Picanto", 30, 5, true);
        vehicles[2] = new Car("Toyota", 80, 10, true);
        vehicles[3] = new Truck("Truck 1", 200, 20, true, 80);
        vehicles[4] = new Truck("Truck 2", 250, 25, true, 200);

        printInfo(vehicles);

    }

    private static void printInfo(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i].getInfo() + " ,Range of this car is: " + vehicles[i].range());

        }

    }

    private static void printRange(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i].range());

        }

    }

}
