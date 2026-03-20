package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.BuilderPattern.Solution;

import java.util.List;

public abstract class StudentBuilder {

    public int rollNumber;
    public int age;
    public String name;
    public String branch;
    public String fatherName;
    public String motherName;
    public List<String> subjects;
    public String mobileNo;
    public String emailId;

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setBranch(String branch){
        this.branch = branch;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }

    public StudentBuilder setEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    abstract public StudentBuilder setSubjects() ;

    //Build method
    public Student build(){
        return new Student(this);
    }
}
