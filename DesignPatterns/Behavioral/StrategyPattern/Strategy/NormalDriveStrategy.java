package LLD_HLD.DesignPatterns.Behavioral.StrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("normal drive compatibilty");
    }
}
