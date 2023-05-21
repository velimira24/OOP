package CarBase;

import Service.iSpeedCalculation;

public class Car extends Vehicle implements iSpeedCalculation {

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}