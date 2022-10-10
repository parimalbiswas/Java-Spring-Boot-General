package FunctionalProgramming.parmtrStudentReturnStdntObjct;

public class Demo_ReStObj {

    Intr_ReturnStudentObj i1 = (roll, name, marks) -> new StudentReturnObj(roll,name,marks+100);
}
