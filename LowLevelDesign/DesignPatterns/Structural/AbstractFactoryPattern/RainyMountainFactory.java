package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern;

import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.Interfaces.GameFactory;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.Interfaces.Terrain;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.Interfaces.Vehicle;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.Interfaces.Weather;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.RainyMountainFamily.MountainTerrain;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.RainyMountainFamily.MountainVehicle;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.RainyMountainFamily.RainyWeather;

public class RainyMountainFactory implements GameFactory {
    @Override
    public Terrain createTerrain() {
        return new MountainTerrain();
    }

    @Override
    public Vehicle createVehicle() {
        return new MountainVehicle();
    }

    @Override
    public Weather createWeather() {
        return new RainyWeather();
    }
}
