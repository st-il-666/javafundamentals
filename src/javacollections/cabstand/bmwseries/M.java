package javacollections.cabstand.bmwseries;

import javacollections.cabstand.Car;

public class M extends Car {

    {
        addCharacteristics();
    }

    public M(double fuelConsumptionCity, double fuelConsumptionOutOfCity, double speed100km, int doors, int topSpeed, int price, String production, String carClass, String model) {
        super(fuelConsumptionCity, fuelConsumptionOutOfCity, speed100km, doors, topSpeed, price, production, carClass, model);
        this.production = "1978 – present";
    }

    private void addCharacteristics() {

        petrolEngines.add("M1");
        petrolEngines.add("M535i");
        petrolEngines.add("M 635 CSi");
        petrolEngines.add("M5");
        petrolEngines.add("M3");
        petrolEngines.add("M4");
        petrolEngines.add("M8");
        petrolEngines.add("M6");
        petrolEngines.add("M2");
        petrolEngines.add("X5 M");
        petrolEngines.add("X6 M");
        petrolEngines.add("X3 M");
        petrolEngines.add("X4 M");

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
