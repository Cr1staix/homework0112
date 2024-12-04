/**
 * Класс создает объект типа Car.
 */

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private Integer year;

    public Car(String brand, String model, Integer year) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(year, car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + year;

    }
}
