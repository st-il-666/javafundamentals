package javacollections.cabstand.bmwhierarhy.bmwseries;

import javacollections.cabstand.bmwhierarhy.Car;

public class Series5 extends Car {

    {
        addCharacteristics();
    }


    public Series5(double fuelConsumptionCity, double fuelConsumptionOutOfCity, double speed100km, int doors, int topSpeed, int price, String production, String carClass, String model) {
        super(fuelConsumptionCity, fuelConsumptionOutOfCity, speed100km, doors, topSpeed, price, production, carClass, model);
        this.production = "1972–present";
        this.carClass = "E";
    }

    private void addCharacteristics() {

        dieselEngines.add("520d");
        dieselEngines.add("520d xDrive");
        petrolEngines.add("520i");
        petrolEngines.add("530i xDrive");
        dieselEngines.add("530d xDrive");
        petrolEngines.add("540i xDrive");
        dieselEngines.add("M550d xDrive");
        dieselEngines.add("М550i xDrive");

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
