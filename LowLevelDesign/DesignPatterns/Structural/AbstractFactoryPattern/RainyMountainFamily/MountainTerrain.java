package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.RainyMountainFamily;

import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AbstractFactoryPattern.Interfaces.Terrain;

public class MountainTerrain implements Terrain {
    @Override
    public void render() {
        System.out.println("Rendering Mountain Terrain");
    }
}
