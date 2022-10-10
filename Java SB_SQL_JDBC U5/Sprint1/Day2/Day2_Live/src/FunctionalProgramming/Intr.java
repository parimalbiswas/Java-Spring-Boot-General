package FunctionalProgramming;

// MarCary interFace -- > Blank Body Interface -- valid Interface

//Serialazale Clonable Interface

//funtinal interface  should have only one abstract method

@FunctionalInterface
public interface Intr {

     int x =100; //public static final (By Default)
     void fun1(); //public abstract (By Default)

     // N number of Object method can be there.
     // bcz its comes under Object Class
     public abstract String toString();

     public  abstract int hashCode();






}



/*
* Some of the predefined FI in java:
==========================

java.lang.Comparable : public int compareTo(Object obj);

java.util.Comparator : public int compare(Object obj1, Object obj2);

java.lang.Iterable : public Iterator iterator();

java.lang.Runnable : public void run();


**Note: with the help of FI we achive FP in java using Lamda expression.
 */
