package CarBase;

import Service.iSpeedCalculation;

public class Bas extends Vehicle implements iSpeedCalculation {

    public Bas(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }

}
