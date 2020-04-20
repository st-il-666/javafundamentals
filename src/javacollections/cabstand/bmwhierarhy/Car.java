package javacollections.cabstand.bmwhierarhy;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Car {
    protected double fuelConsumptionCity, fuelConsumptionOutOfCity, speed100km;
    protected int doors, topSpeed, price;
    protected String production, carClass, model;
    protected static ArrayList<Integer> doorsInclude = new ArrayList<>();
    protected static ArrayList<Set<String>> carModels = new ArrayList<>();
    protected static Set<String> petrolEngines = new HashSet<>();
    protected static Set<String> dieselEngines = new HashSet<>();
    protected static Set<String> hybrid = new HashSet<>();
    protected static Set<String> electric = new HashSet<>();

    static {
        carModels.add(petrolEngines);
        carModels.add(dieselEngines);
        carModels.add(hybrid);
        carModels.add(electric);
    }


    public Car(double fuelConsumptionCity, double fuelConsumptionOutOfCity, double speed100km, int doors, int topSpeed, int price, String production, String carClass, String model) {
        this.fuelConsumptionCity = fuelConsumptionCity;
        this.fuelConsumptionOutOfCity = fuelConsumptionOutOfCity;
        this.speed100km = speed100km;
        this.doors = doors;
        this.topSpeed = topSpeed;
        this.price = price;
        this.production = production;
        this.carClass = carClass;
        this.model = model;
    }


    @Override
    public String toString() {
        return "Car{" +
                "fuelConsumptionCity=" + fuelConsumptionCity +
                ", fuelConsumptionOutOfCity=" + fuelConsumptionOutOfCity +
                ", speed100km=" + speed100km +
                ", doors=" + doors +
                ", topSpeed=" + topSpeed +
                ", price=" + price +
                ", production='" + production + '\'' +
                ", carClass='" + carClass + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.fuelConsumptionCity, fuelConsumptionCity) == 0 &&
                Double.compare(car.fuelConsumptionOutOfCity, fuelConsumptionOutOfCity) == 0 &&
                Double.compare(car.speed100km, speed100km) == 0 &&
                doors == car.doors &&
                topSpeed == car.topSpeed &&
                price == car.price &&
                Objects.equals(production, car.production) &&
                Objects.equals(carClass, car.carClass) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuelConsumptionCity, fuelConsumptionOutOfCity, speed100km, doors, topSpeed, price, production, carClass, model);
    }

    public double getFuelConsumptionCity() {
        return fuelConsumptionCity;
    }

    public void setFuelConsumptionCity(double fuelConsumptionCity) {
        this.fuelConsumptionCity = fuelConsumptionCity;
    }

    public double getFuelConsumptionOutOfCity() {
        return fuelConsumptionOutOfCity;
    }

    public void setFuelConsumptionOutOfCity(double fuelConsumptionOutOfCity) {
        this.fuelConsumptionOutOfCity = fuelConsumptionOutOfCity;
    }

    public double getSpeed100km() {
        return speed100km;
    }

    public void setSpeed100km(double speed100km) {
        this.speed100km = speed100km;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static ArrayList<Integer> getDoorsInclude() {
        return doorsInclude;
    }

    public static void setDoorsInclude(ArrayList<Integer> doorsInclude) {
        Car.doorsInclude = doorsInclude;
    }

    public static ArrayList<Set<String>> getCarModels() {
        return carModels;
    }

    public static void setCarModels(ArrayList<Set<String>> carModels) {
        Car.carModels = carModels;
    }

    public static Set<String> getPetrolEngines() {
        return petrolEngines;
    }

    public static void setPetrolEngines(Set<String> petrolEngines) {
        Car.petrolEngines = petrolEngines;
    }

    public static Set<String> getDieselEngines() {
        return dieselEngines;
    }

    public static void setDieselEngines(Set<String> dieselEngines) {
        Car.dieselEngines = dieselEngines;
    }
}