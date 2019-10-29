public class VehicleTest {
    public static void main(String[] args) {

        Car[] cars = new Car[5];
        cars[0] = new Car("Nissan", 60, 8, false);
        cars[1] = new Car("KIA Picanto", 30, 5, false);
        cars[2] = new Car("Toyota", 80, 10, false);
        cars[3] = new Truck("Truck 1", 200, 20, false, 80);
        cars[4] = new Truck("Truck 2", 250, 25, false, 200);


        printInfo(cars);
        
        cars[0].airOn();
        cars[1].airOn();
        cars[2].airOn();
        cars[3].airOn();
        cars[4].airOn();

        System.out.println();

        printInfo(cars);

    }

        private static void printInfo (Car[]cars){
            for (int i = 0; i < cars.length; i++) {
                System.out.println(cars[i].getInfo() + " ,Range of this car is: " + cars[i].range());
            }
        }

    //    private static void airconOn(Car[] cars) {
//        for (int i = 0; i < cars.length; i++) {
//
//        }
//    }



    }
