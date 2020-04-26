package CarShowroom;

public class MainForCar {
    public static void main(String[] args){
        Car[] cars = new Car[5];

        cars[0] = new Car("Audi", "A3", "хетчбэк", 2012, 5, 1.4, 148, 12,37000);
        cars[1] = new Car("Ferrari", "488 GTB", "берлинетта", 2015, 2, 3.9, 670, 11.4, 280000);
        cars[2] = new Car("BMW", "X5", "хетчбэк", 2016, 5, 3, 306, 8.5, 70000);
        cars[3] = new Car("Infiniti", "Q50", "седан", 2018, 5, 2, 211, 7, 38000);
        cars[4] = new Car("Mazda", "6", "седан", 2019, 5,2, 150, 6.3, 32000);

        CarShowroom carShowroom = new CarShowroom(cars);

        carShowroom.searchByBodyType();
        carShowroom.searchByFuelConsumption();
        carShowroom.searchByMark();
        carShowroom.searchByPassengerCapacity();
        carShowroom.searchByYear();
    }

}
