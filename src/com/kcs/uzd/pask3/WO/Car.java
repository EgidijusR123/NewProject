package com.kcs.uzd.pask3.WO;

import java.util.Comparator;

/**
 * Created by Egidijus on 3/1/2017.
 */
public class Car implements Comparable<Car>
{
    private String model;
    private String year;
    private double carPrice;

   /* public Car(String model, String year,double price){
        this.model=model;
        this.year=year;
        this.carPrice=price;
    }*/

    public Car(String model, String year,String cprice){
        this.model=model;
        this.year=year;
        this.carPrice=Double.parseDouble(cprice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.carPrice, carPrice) != 0) return false;
        if (!model.equals(car.model)) return false;
        return year.equals(car.year);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = model.hashCode();
        result = 31 * result + year.hashCode();
        temp = Double.doubleToLongBits(carPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", carPrice=" + carPrice +
                '}';
    }

    @Override
    public int compareTo(Car o) {
       // return model.compareTo(o.getModel());
        if(carPrice>o.carPrice)
            return -1;
        else if(carPrice<o.getCarPrice())return 1;
        else return year.compareTo(o.getYear());
    }
}
