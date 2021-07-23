/**
      @author       Marco Martinez
      @fileName     Number.java
      @version      1.0
      @description  This program will create and manipulate Number objects.
      @date         12/8/2018
 
         Program Change Log 
         ==================
         Name        Date     Description
         Marco       12/8     Create baseline for Number.java
 */
 
public class Number
{
   // INSTANCE VARIABLE DECLARATION
   private int integerPart;
   private double realPart;
   
   // CLASS CONSTRUCTORS
   public Number(){}
   
   public Number(int integer)
   {
      this.integerPart = integer;
      this.realPart = 0.00;
   }
   
   public Number(double real)
   {
      this.integerPart = (int) real;
      this.realPart = real % 1;
   }
   
   public Number(int integer,double real)
   {
      this.integerPart = integer;
      this.integerPart += (int) real;
      this.realPart = real % 1;
   }
   
   public Number(float real)
   {
      this.integerPart = (int) real;
      this.realPart = (double) real % 1;
   }
   
   public Number(int integer,float real)
   {
      this.integerPart = integer;
      this.integerPart = (int) real;
      this.realPart = real % 1;
   }
   
   public Number(Number number)
   {
      this.integerPart = number.getInt();
      this.realPart = number.getReal();
   }
   
   // CHANGE STATE SERVICES
   public void setInt(int integer)
   {
      this.integerPart = integer;
   }
   
   public void setInt(double integer)
   {
      this.integerPart = (int) integer;
   }
   
   public void setInt(float integer)
   {
      this.integerPart = (int) integer;
   }
   
   public void setReal(int real)
   {
      this.realPart = (double) real % 1;
   }
   
   public void setReal(double real)
   {
      this.realPart = real % 1;
   }
   
   public void setReal(float real)
   {
      this.realPart = (double) real % 1;
   }
   
   // READ STATE SERVICES
   public int getInt()
   {
      return this.integerPart;
   }
   
   public double getReal()
   {
      return this.realPart;
   }
   
   public String toString()
   {
      return Integer.toString(integerPart)+(Double.toString(realPart)).replaceFirst("^0\\.", ".");
   }
}