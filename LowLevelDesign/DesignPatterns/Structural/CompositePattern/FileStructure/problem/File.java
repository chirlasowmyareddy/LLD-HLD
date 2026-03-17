package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.CompositePattern.FileStructure.problem;

public class File {
    
    String fileName;

    public File(String name){
        this.fileName = name;
    }

    public void printContents(){
        System.out.println("File name: "+ fileName);
    }
}
