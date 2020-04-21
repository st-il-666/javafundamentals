package javacollections.cabstand.bmwseries;

import javacollections.cabstand.Car;

public class Series2 extends Car {

    {
        addCharacteristics();
    }

    public Series2(double fuelConsumptionCity, double fuelConsumptionOutOfCity, double speed100km, int doors, int topSpeed, int price, String production, String carClass, String model) {
        super(fuelConsumptionCity, fuelConsumptionOutOfCity, speed100km, doors, topSpeed, price, production, carClass, model);
        this.production = "2013 – present";
        this.carClass = "C";
    }

    private void addCharacteristics() {

        doorsInclude.add(2);

        petrolEngines.add("218i");
        petrolEngines.add("230i");
        petrolEngines.add("230i xDrive");
        petrolEngines.add("M240i");
        petrolEngines.add("M240i xDrive");
        petrolEngines.add("M2 Competition Coupe");

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
