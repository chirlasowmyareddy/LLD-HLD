package LLD_HLD.DesignPatterns.Behavioral.StrategyPattern;

import LLD_HLD.DesignPatterns.Behavioral.StrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
