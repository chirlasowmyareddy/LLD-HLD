package LLD_HLD.HighLevelDesign.HandleNullObject;

public class Main {

    public static void main(String[] args){
        Vehicle vehicle = VehicleFactory.getVehicleObject("Car");
        printVehicleDetails(vehicle);

        Vehicle vehicle1 = VehicleFactory.getVehicleObject("Bike");
        printVehicleDetails(vehicle1);

    }

    private static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Seating capacity "+ vehicle.getSeatingCapacity());
        System.out.println("Fuel Tank Capacity "+vehicle.getTankCapacity());
    }
    
}

/*
Design Object Design Pattern
    A null object replaces null return type
    No need to put IF check for checking NULL
    Null object reflects DO Nothing or Default Behaviour
 */
