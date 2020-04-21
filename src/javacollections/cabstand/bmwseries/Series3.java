package javacollections.cabstand.bmwseries;

import javacollections.cabstand.Car;

public class Series3 extends Car {

    {
        addCharacteristics();
    }

    public Series3(double fuelConsumptionCity, double fuelConsumptionOutOfCity, double speed100km, int doors, int topSpeed, int price, String production, String carClass, String model) {
        super(fuelConsumptionCity, fuelConsumptionOutOfCity, speed100km, doors, topSpeed, price, production, carClass, model);
        this.production = "1975–present";
        this.carClass = "D";
    }

    private void addCharacteristics() {

        doorsInclude.add(4);

        dieselEngines.add("318d");
        petrolEngines.add("320i");
        petrolEngines.add("320i xDrive");
        dieselEngines.add("320d xDrive");
        dieselEngines.add("330d xDrive");
        petrolEngines.add("M340i xDrive");

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
