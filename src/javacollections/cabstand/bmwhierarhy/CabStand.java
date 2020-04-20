package javacollections.cabstand.bmwhierarhy;


import javacollections.cabstand.bmwhierarhy.bmwseries.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CabStand {
    static ArrayList<Car> carsList = new ArrayList<>();
    static double cabStationPrice;

    public static void main(String[] args) throws IOException {
        addCar();
        getCabStationPrice();
        System.out.println("Cab station price is: " + cabStationPrice);
        sortCarsByFuelConsumptionInTheCity(carsList);
        System.out.println("Cars are sorted by fuel consumption in the city: ");
        for (Car car : carsList) System.out.println(car);
        printCarsWithDesiredMaxSpeed(carsList);
    }

    public static void addCar() {

        carsList.add(new Series1(7.7, 4.6, 7.9, 5, 220, 11700, "2013", "C", "120d"));
        carsList.add(new Series1(10.9, 6.4, 5.1, 3, 250, 13430, "2013", "C", "M135i"));
        carsList.add(new Series1(5.1, 3.9, 6.3, 3, 240, 10480, "2013", "C", "125d"));
        carsList.add(new Series2(9.4, 5.8, 4.6, 2, 250, 46060, "2018", "C", "M240i"));
        carsList.add(new Series3(5.6, 4.1, 8.3, 4, 226, 32340, "2020", "D", "318d"));
        carsList.add(new Series4(7.1, 4.5, 7.7, 5, 236, 38570, "2019", "D", "420i"));
        carsList.add(new Series4(5.2, 4.1, 7.4, 5, 230, 45330, "2020", "D", "420d xDrive"));
        carsList.add(new Series5(7.4, 5.5, 7.8, 4, 235, 37811, "2020", "E", "520i"));
        carsList.add(new Series5(6.6, 5.0, 5.4, 4, 250, 62346, "2020", "E", "530d xDrive"));
        carsList.add(new Series6(6.7, 5.2, 6, 5, 250, 61064, "2020", "S", "630d xDrive"));
        carsList.add(new Series7(6.3, 4.7, 5.9, 4, 250, 93874, "2020", "F", "730Ld xDrive"));
        carsList.add(new Series8(7.5, 5.9, 4.9, 2, 250, 106134, "2019", "S", "840d xDrive"));
        carsList.add(new Series8(14.9, 8.2, 3.9, 2, 250, 122395, "2019", "S", "M850i xDrive"));
        carsList.add(new X(7.7, 5.6, 7.4, 5, 223, 48168, "2019", "SAV", "X1 xDrive20i"));
        carsList.add(new X(7.3, 6.3, 4.9, 5, 250, 62490, "2019", "SAV", "X4 xDrive M40d"));
        carsList.add(new Z(7.4, 5.3, 5.4, 2, 250, 49700, "2019", "S", "X4 xDrive M40d"));
        carsList.add(new M(15.3, 8.0, 3.2, 2, 250, 157802, "2019", "S", "BMW M8"));
        carsList.add(new I(2.1, 2.0, 4.6, 2, 250, 164300, "2019", "S", "i8 Roadster"));

    }

    private static void getCabStationPrice() {
        for (Car carPrice : carsList) {
            cabStationPrice += carPrice.getPrice();
        }
    }

    private static void sortCarsByFuelConsumptionInTheCity(ArrayList<Car> cars) {
        cars.sort((car1, car2) -> ((int) Math.round(100.0 * (car1.getFuelConsumptionCity() - car2.getFuelConsumptionCity()))));
    }

    private static void printCarsWithDesiredMaxSpeed(ArrayList<Car> cars) throws IOException {
        ArrayList<Car> carsFilteredBySpeed = new ArrayList<>();
        System.out.println("What is the maximum number of seconds a car accelerates from 0 to 100?");
        double maxSecond = getSpeed();
        System.out.println("What speed value shall car not exceed?");
        double maxSpeedValue = getSpeed();
        for (Car car : cars) {
            if (car.getSpeed100km() < maxSecond && car.getTopSpeed() < maxSpeedValue) {
                carsFilteredBySpeed.add(car);
                System.out.println(car.toString());
            }
        }
        if (carsFilteredBySpeed.size()==0) {
            System.out.println("There are no cars applying to the entered data.");
        }
    }

    private static double getSpeed() throws IOException {
        double currentSpeed;

        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                currentSpeed = Double.parseDouble(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid speed. You may use point,  if you want to type decimal value.");
            }
        }
        return currentSpeed;
    }
}
