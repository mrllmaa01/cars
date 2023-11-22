package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(300, "Mercedes-Benz");
        Driver driver = new Driver("Лапшина Маргарита Анатольевна", 1);
        Car car = new Car("Mercedes", "Седан", 1100, driver, engine);
        System.out.println(car.toString());

        Lorry lorry = new Lorry("MAN", "Truck", 4000, driver, engine, 100);
        System.out.println(lorry.toString());

        SportCar sportCar = new SportCar("Porsche", "Coupe", 1200, driver, engine, 550);
        System.out.println(sportCar.toString());

        System.out.println(engine.getManufacturer());
        engine.setManufacturer("Mercedes-Benz 2");
        System.out.println(engine.getManufacturer());
    }

}
