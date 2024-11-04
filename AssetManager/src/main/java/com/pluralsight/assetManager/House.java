package com.pluralsight.assetManager;

public class House extends Asset{
    String address;
    int condition;
    int squareFoot;
    int lotSize;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }
    
    @Override
    public double getValue(){
        double valuepersquarefoot = 0;
        switch (condition) {
            case 1 -> valuepersquarefoot = 180;
            case 2 -> valuepersquarefoot = 130;
            case 3 -> valuepersquarefoot = 90;
            case 4 -> valuepersquarefoot = 80;
            default -> System.out.println("Sorry not a valid entry");
        }
        return (valuepersquarefoot * squareFoot) + (0.25 * lotSize);
    }
}

