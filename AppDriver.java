/**
      @author       Marco Martinez
      @fileName     AppDriver.java
      @version      1.0
      @description  This program will test Number/NumberMath objects.
      @date         12/8/2018
 
         Program Change Log 
         ==================
         Name        Date     Description
         Marco       12/8     Create baseline for AppDriver.java
 */
 
public class AppDriver
{
   public static void main(String[] args) 
   {
      NumberMath myNum1 = new NumberMath();
      NumberMath myNum2 = new NumberMath((int)2);
      NumberMath myNum3 = new NumberMath((int)3,(int)4);
      NumberMath myNum4 = new NumberMath((int)5,5.5,(int)3,9.4);
      NumberMath myNum5 = new NumberMath((int)5,(float).44,(int)9,(float).333);
      NumberMath myNum6 = new NumberMath(myNum5.getA(),myNum5.getB());
      NumberMath myNum = new NumberMath(10.5,2.25);
      myNum.add();
      System.out.println("The result of adding "+ (myNum.getA()).toString() +" and "+ (myNum.getB()).toString() +": "+myNum.toString());
      System.out.println();
      myNum.sub();
      System.out.println("The result of subtracting "+ (myNum.getA()).toString() +" and "+ (myNum.getB()).toString() +": "+myNum.toString());
      System.out.println();
      myNum.mul();
      System.out.println("The result of multiplying "+ (myNum.getA()).toString() +" and "+ (myNum.getB()).toString() +": "+myNum.toString());
      System.out.println();
      myNum.div();
      System.out.println("The result of dividing "+ (myNum.getA()).toString() +" and "+ (myNum.getB()).toString() +": "+myNum.toString());
   }
}