package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern;

import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.Interfaces.GameFactory;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.Interfaces.Terrain;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.Interfaces.Vehicle;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.Interfaces.Weather;

public class Game {

    private Terrain terrain;
    private Vehicle vehicle;
    private Weather weather;

    public Game(GameFactory factory){
        this.terrain = factory.createTerrain();
        this.vehicle = factory.createVehicle();
        this.weather = factory.createWeather();
    }

    public void startGame(){
        terrain.render();
        vehicle.drive();
        weather.showWeather();
    }
}
