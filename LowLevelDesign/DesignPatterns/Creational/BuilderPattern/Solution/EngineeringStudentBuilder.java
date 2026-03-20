package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.BuilderPattern.Solution;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> enggSubjectsList = new ArrayList<>();
        enggSubjectsList.add("Operating Systems");
        enggSubjectsList.add("Computer Architecture");
        enggSubjectsList.add("Data Structures");

        this.subjects = enggSubjectsList;
        return this;
    }
}
