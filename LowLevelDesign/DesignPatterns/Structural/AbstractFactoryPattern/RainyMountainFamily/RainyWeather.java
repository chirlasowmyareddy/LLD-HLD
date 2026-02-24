package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.RainyMountainFamily;

import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.Interfaces.Weather;

public class RainyWeather implements Weather {
    @Override
    public void showWeather() {
        System.out.println("Showing Rainy Weather");
    }
}
