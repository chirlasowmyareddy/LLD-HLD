package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.SunnyDessertFamily;

import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.Interfaces.Weather;

public class SunnyWeather implements Weather {
    @Override
    public void showWeather() {
        System.out.println("Showing sunny weather");
    }
}
