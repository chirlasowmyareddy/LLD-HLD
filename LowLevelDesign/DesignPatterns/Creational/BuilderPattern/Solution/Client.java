package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.BuilderPattern.Solution;

public class Client {

    //Step by step object creation pattern

    //cannot support dynamic object creations

    public static void main(String[] args){
        System.out.println("============Builder Design Pattern============");

        StudentRegistrationDirector enggStudentDirector = new StudentRegistrationDirector(new EngineeringStudentBuilder());
        StudentRegistrationDirector mbaStudentDirector = new StudentRegistrationDirector(new MBAStudentBuilder());

        //create students using different builders
        Student engineerStudent = enggStudentDirector.createStudent();
        Student mbaStudent = mbaStudentDirector.createStudent();

        System.out.println("======>Student Details: "+ engineerStudent);
        System.out.println("======>Student Details: "+mbaStudent);


    }
}
