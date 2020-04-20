package javacollections.cabstand.bmwhierarhy.bmwseries;

import javacollections.cabstand.bmwhierarhy.Car;

public class Z extends Car {

    {
        addCharacteristics();
    }


    public Z(double fuelConsumptionCity, double fuelConsumptionOutOfCity, double speed100km, int doors, int topSpeed, int price, String production, String carClass, String model) {
        super(fuelConsumptionCity, fuelConsumptionOutOfCity, speed100km, doors, topSpeed, price, production, carClass, model);
        this.production = "2018 – present";
        this.carClass = "S";
    }

    private void addCharacteristics() {

        petrolEngines.add("sDrive20i");
        petrolEngines.add("sDrive30i");
        petrolEngines.add("M40i");

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
