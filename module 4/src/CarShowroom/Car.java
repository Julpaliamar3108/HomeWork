package CarShowroom;

public class Car {
    private String mark;
    private String model;
    private String bodyType;
    private int year;
    private int passengerCapacity;
    private double engineVolume;
    private double enginePower;
    private double fuelConsumption;
    private double cost;

    public Car(String mark, String model, String bodyType, int year, int passengerCapacity, double engineVolume, double enginePower, double fuelConsumption, double cost){
        this.mark = mark;
        this.model = model;
        this.bodyType = bodyType;
        this.year = year;
        this.passengerCapacity = passengerCapacity;
        this.engineVolume = engineVolume;
        this.enginePower = enginePower;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return  "mark: " + mark + ";" + '\n' +
                "model: " + model + ";" + '\n' +
                "bodyType: " + bodyType + ";" + '\n' +
                "year: " + year + ";" + '\n' +
                "passengerCapacity: " + passengerCapacity + ";" + '\n' +
                "engineVolume: " + engineVolume + ";" + '\n' +
                "enginePower: " + enginePower + ";" + '\n' +
                "fuelConsumption: " + fuelConsumption + ";" + '\n' +
                "cost: " + cost + " $"+ '\n' + "***";
    }

    public String getMark() {
        return mark;
    }

    public int getYear() {
        return year;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getBodyType() {
        return bodyType;
    }
}
