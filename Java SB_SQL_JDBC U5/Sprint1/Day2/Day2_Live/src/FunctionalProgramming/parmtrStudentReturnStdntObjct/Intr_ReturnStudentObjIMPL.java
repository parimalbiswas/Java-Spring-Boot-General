package FunctionalProgramming.parmtrStudentReturnStdntObjct;

public class Intr_ReturnStudentObjIMPL implements Intr_ReturnStudentObj{


    @Override
    public StudentReturnObj getStudentMthod(int roll, String name, int marks) {

        StudentReturnObj sOBj = new StudentReturnObj(roll,name,marks+100);

        return sOBj;
    }
}
