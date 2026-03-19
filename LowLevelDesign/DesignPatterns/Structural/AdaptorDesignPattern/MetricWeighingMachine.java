package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.AdaptorDesignPattern;

public class MetricWeighingMachine {
    public static void main(String[] args){
        System.out.println("================Adaptor Design Pattern================");

        // ImperialWeighingMachine - // Existing weighing machine is used to weigh the baby in pounds
        double weighingScaleReading = 25.0;// say the baby's weight is 25 pounds
        ImperialWeighingMachine imperialWeighingMachine = new ImperialWeighingMachineImpl(weighingScaleReading);

        //Adaptor to convert to KG
        WeighingMachineAdapter weighingMachineAdapter = new WeightMachineAdapterImpl(imperialWeighingMachine);

        //Client gets weight in Kilogram
        System.out.println("Weight in KG: "+ weighingMachineAdapter.getWeightInKg());
    }
    
}
