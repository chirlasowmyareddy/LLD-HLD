package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.CompositePattern.FileStructure.problem;

public class Client {

    public static void main(String[] args){
        Directory movieDirectory = new Directory("Movies");

        File rentalReceipt = new File("RentalReceipt");
        movieDirectory.add(rentalReceipt);

        Directory comedyMovieDirectory = new Directory("ComedyMovies");
        File dumbAndNumber = new File("DumbAndUmber");
        comedyMovieDirectory.add(dumbAndNumber);
        movieDirectory.add(comedyMovieDirectory);
        movieDirectory.printContents();
    }
    
}
