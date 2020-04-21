package javacollections.cabstand.bmwseries;

import javacollections.cabstand.Car;

public class I extends Car {

    {
        addCharacteristics();
    }


    public I(double fuelConsumptionCity, double fuelConsumptionOutOfCity, double speed100km, int doors, int topSpeed, int price, String production, String carClass, String model) {
        super(fuelConsumptionCity, fuelConsumptionOutOfCity, speed100km, doors, topSpeed, price, production, carClass, model);
        this.production = "2011 – present";
        this.carClass = "S";
    }

    private void addCharacteristics() {

        electric.add("i3");
        hybrid.add("i8");
        hybrid.add("i8 Cabrio");
        hybrid.add("i8 Roadster");

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

