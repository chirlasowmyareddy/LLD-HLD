package LLD_HLD.DesignPatterns.Behavioral.StrategyPattern;

import LLD_HLD.DesignPatterns.Behavioral.StrategyPattern.Strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle()
    {
        super(new NormalDriveStrategy());
    }
}
