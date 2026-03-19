package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AdaptorDesignPattern;


// Adaptee - Existing Incompatible class
public class ImperialWeighingMachineImpl implements ImperialWeighingMachine{

    double weightInPounds = 0;

    public ImperialWeighingMachineImpl(double weightScaleReading) {
        this.weightInPounds = weightScaleReading;
    }

    // Third-party weighing machine (US model) – returns pounds
    @Override
    public double getWeightInPounds() {
        return weightInPounds;
    }
}
