package javacollections.cabstand.bmwhierarhy.bmwseries;

import javacollections.cabstand.bmwhierarhy.Car;

public class Series1 extends Car {
    {
        addCharacteristics();
    }

    public Series1(double fuelConsumptionCity, double fuelConsumptionOutOfCity, double speed100km, int doors, int topSpeed, int price, String production, String carClass, String model) {
        super(fuelConsumptionCity, fuelConsumptionOutOfCity, speed100km, doors, topSpeed, price, production, carClass, model);
        this.production = "2004–present";
        this.carClass = "C";
    }

    private void addCharacteristics() {

        doorsInclude.add(3);
        doorsInclude.add(5);

        petrolEngines.add("114i");
        petrolEngines.add("116i");
        petrolEngines.add("118i");
        petrolEngines.add("120i");
        petrolEngines.add("125i");
        petrolEngines.add("M135i");
        petrolEngines.add("M140i");

        dieselEngines.add("114d");
        dieselEngines.add("116d");
        dieselEngines.add("118d");
        dieselEngines.add("120d");
        dieselEngines.add("125d");
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
