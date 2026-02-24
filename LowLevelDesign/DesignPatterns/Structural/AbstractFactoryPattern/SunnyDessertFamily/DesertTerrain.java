package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.SunnyDessertFamily;

import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.Interfaces.Terrain;

public class DesertTerrain implements Terrain {
    @Override
    public void render() {
        System.out.println("Rendering desert Terrain");
    }
}
