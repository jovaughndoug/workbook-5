package com.pluralsight.assetManager;

public class Vehicle extends Asset {
    int year;
    int odometer;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public Vehicle(String description, String dateAcquired, double originalCost, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        switch (year){
            double value = originalCost;
            if (year >= 2021) {
                value = originalCost - (0.03 * originalCost);
            } else if (year >= 2018) {
                value = originalCost - (0.06 * originalCost);
            } else if (year >= 2014) {
                value = originalCost - (0.08 * originalCost);
            } else {
                value = originalCost - (1000);
            }

            if (!getMakeModel().toLowerCase().contains("toyota") && !getMakeModel().toLowerCase().contains("honda") && getOdometer() > 100000) {
                value = value - (0.25 * value);
            }
            return value;

        }
    }
}
