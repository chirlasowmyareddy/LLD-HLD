package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern;

import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.Interfaces.GameFactory;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.Interfaces.Terrain;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.Interfaces.Vehicle;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.Interfaces.Weather;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.SunnyDessertFamily.DesertTerrain;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.SunnyDessertFamily.DesertVehicle;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.SunnyDessertFamily.SunnyWeather;

public class SunnyDesertFactory implements GameFactory {
    @Override
    public Terrain createTerrain() {
        return new DesertTerrain();
    }

    @Override
    public Vehicle createVehicle() {
        return new DesertVehicle();
    }

    @Override
    public Weather createWeather() {
        return new SunnyWeather();
    }
}
