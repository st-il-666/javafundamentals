package javacollections.cabstand.bmwseries;

import javacollections.cabstand.Car;

public class Series4 extends Car {

    {
        addCharacteristics();
    }


    public Series4(double fuelConsumptionCity, double fuelConsumptionOutOfCity, double speed100km, int doors, int topSpeed, int price, String production, String carClass, String model) {
        super(fuelConsumptionCity, fuelConsumptionOutOfCity, speed100km, doors, topSpeed, price, production, carClass, model);
        this.production = "2014–present";
        this.carClass = "D";
    }

    private void addCharacteristics() {

        dieselEngines.add("420d xDrive");
        petrolEngines.add("420i");
        petrolEngines.add("420i xDrive");
        petrolEngines.add("430i xDrive");
        petrolEngines.add("440i xDrive");

    }

    @Override
    public String getProduction() {
        return production;
    }

    @Override
    public String getCarClass() {
        return carClass;
    }

}
