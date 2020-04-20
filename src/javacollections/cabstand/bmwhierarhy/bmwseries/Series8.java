package javacollections.cabstand.bmwhierarhy.bmwseries;

import javacollections.cabstand.bmwhierarhy.Car;

public class Series8 extends Car {

    {
        addCharacteristics();
    }


    public Series8(double fuelConsumptionCity, double fuelConsumptionOutOfCity, double speed100km, int doors, int topSpeed, int price, String production, String carClass, String model) {
        super(fuelConsumptionCity, fuelConsumptionOutOfCity, speed100km, doors, topSpeed, price, production, carClass, model);
        this.production = "2018–present";
        this.carClass = "S";
    }

    private void addCharacteristics() {

        petrolEngines.add("M850i xDrive");
        dieselEngines.add("840d xDrive");
        petrolEngines.add("840i xDrive");
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
