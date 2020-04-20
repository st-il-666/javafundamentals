package javacollections.cabstand.bmwhierarhy.bmwseries;

import javacollections.cabstand.bmwhierarhy.Car;

public class Series7 extends Car {

    {
        addCharacteristics();
    }


    public Series7(double fuelConsumptionCity, double fuelConsumptionOutOfCity, double speed100km, int doors, int topSpeed, int price, String production, String carClass, String model) {
        super(fuelConsumptionCity, fuelConsumptionOutOfCity, speed100km, doors, topSpeed, price, production, carClass, model);
        this.production = "1977–present";
        this.carClass = "F";
    }

    private void addCharacteristics() {

        petrolEngines.add("730i");
        dieselEngines.add("730d xDrive");
        dieselEngines.add("740d xDrive");
        dieselEngines.add("730Ld xDrive");
        petrolEngines.add("740Li xDrive");
        dieselEngines.add("740Ld xDrive");
        dieselEngines.add("750d xDrive");
        dieselEngines.add("750Ld xDrive");
        petrolEngines.add("750Li xDrive");
        petrolEngines.add("M760Li xDrive");

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
