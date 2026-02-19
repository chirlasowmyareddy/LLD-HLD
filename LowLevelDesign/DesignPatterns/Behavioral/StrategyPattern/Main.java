package LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.StrategyPattern;

import LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.StrategyPattern.Strategy.DriveStrategy;
import LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.StrategyPattern.Strategy.NormalDriveStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();

        //another way of using without creating OffRoadVehicle
        //but this is not as not hiding implementation details
        DriveStrategy NormalDriveStrategy = new NormalDriveStrategy();
        Vehicle vehicle1 =  new Vehicle(NormalDriveStrategy);
        vehicle1.drive();

        Vehicle vehicle2 = new GoodsVehicle();
        vehicle2.drive();
    }
}
