package javacollections.cabstand.bmwhierarhy.bmwseries;

import javacollections.cabstand.bmwhierarhy.Car;

public class Series6 extends Car {

    {
        addCharacteristics();
    }


    public Series6(double fuelConsumptionCity, double fuelConsumptionOutOfCity, double speed100km, int doors, int topSpeed, int price, String production, String carClass, String model) {
        super(fuelConsumptionCity, fuelConsumptionOutOfCity, speed100km, doors, topSpeed, price, production, carClass, model);
        this.production = "2003–present";
        this.carClass = "S";
    }

    private void addCharacteristics() {

        petrolEngines.add("630i");
        petrolEngines.add("640i xDrive");
        dieselEngines.add("620d xDrive");
        dieselEngines.add("630d xDrive");
        dieselEngines.add("640d xDrive");
        petrolEngines.add("640i");
        petrolEngines.add("640i xDrive");
        petrolEngines.add("650i");
        petrolEngines.add("650i xDrive");
        petrolEngines.add("M6");
        petrolEngines.add("Alpina B6 xDrive");
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
