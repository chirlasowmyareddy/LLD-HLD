package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.CompositePattern.FileStructure.solution;

public class File implements FileSystemComponent{

    String fileName;

    public File(String name){
        this.fileName = name;
    }

    @Override
    public void printContents() {
        System.out.println("File Name: "+fileName);
    }

    
    
}
