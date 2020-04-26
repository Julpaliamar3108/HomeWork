package CarShowroom;

import java.util.Scanner;

public class CarShowroom {
    Car[] cars;
    public CarShowroom(Car[] cars){
        this.cars = cars;
    }

    public void searchByMark(){
        System.out.println("Какую марку машины хотите приобрести?");
        Scanner scan = new Scanner(System.in);
        String mark = scan.nextLine();
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getMark().equalsIgnoreCase(mark)) {
                System.out.println(cars[i].toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Автомобили данной марки остутствуют в нашем автосалоне");
        }

    }

    public void searchByYear(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Автомобили какого года выпуска Вас интересуют (от и до)? " + '\n' + "От: ");
        int minYear = scan.nextInt();
        System.out.println("До: ");
        int maxYear = scan.nextInt();
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (minYear <= cars[i].getYear() && cars[i].getYear()<= maxYear) {
                if(count == 0){
                    System.out.println("В наличие имеются следующие автомобили:");
                }
                System.out.println(cars[i].toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("У нас нет автомобилей выпущенных с " + minYear + " года по " + maxYear + " год");
        }
    }


    public void searchByPassengerCapacity(){
        System.out.println("Какое количество посадных мест Вы бы хотели?");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPassengerCapacity() == number) {
                if (count == 0){
                System.out.println("Вам подойдут следующие автомобили:");
                }
                System.out.println(cars[i].toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Автомобили с такой пассажировместимостью остутствуют в нашем автосалоне");
        }

    }

    public void searchByFuelConsumption(){
        System.out.println("Какой расход топлива Вас интересует (от и до)? " + '\n' + "От: ");
        Scanner scan = new Scanner(System.in);
        double min = scan.nextDouble();
        System.out.println("До: ");
        double max = scan.nextDouble();
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (min <= cars[i].getFuelConsumption() && cars[i].getFuelConsumption()<= max) {
                if(count == 0){
                System.out.println("Вам подойдут слудующие автомобили: " );
                }
                System.out.println(cars[i].toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Автомобили с таким расходом топлива отсутствуют в нашем автосалоне");
        }

    }

    public void searchByBodyType(){
        System.out.println("Какой тип кузова Вас интересует?");
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getBodyType().equalsIgnoreCase(type)) {
                if (count == 0){
                    System.out.println("Вам подойдут следующие автомобили: ");
                }
                System.out.println(cars[i].toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Автомобили с таким типом кузова остутствуют в нашем автосалоне");
        }

    }
}
