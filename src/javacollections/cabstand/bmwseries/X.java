package javacollections.cabstand.bmwseries;

import javacollections.cabstand.Car;

public class X extends Car {

    {
        addCharacteristics();
    }


    public X(double fuelConsumptionCity, double fuelConsumptionOutOfCity, double speed100km, int doors, int topSpeed, int price, String production, String carClass, String model) {
        super(fuelConsumptionCity, fuelConsumptionOutOfCity, speed100km, doors, topSpeed, price, production, carClass, model);
        this.production = "2009 – present";
        this.carClass = "SAV";
    }

    private void addCharacteristics() {

        petrolEngines.add("sDrive18i");
        petrolEngines.add("xDrive20i");
        dieselEngines.add("xDrive18d");
        dieselEngines.add("xDrive 30d");
        dieselEngines.add("M40d");
        dieselEngines.add("xDrive M40d");
        petrolEngines.add("xDrive 30i");
        petrolEngines.add("M40i");
        petrolEngines.add("M50i");
        petrolEngines.add("xDrive M50i");
        dieselEngines.add("M50d");
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
