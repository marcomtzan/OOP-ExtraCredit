/**
      @author       Marco Martinez
      @fileName     NumberMath.java
      @version      1.0
      @description  This program will create and manipulate NumberMath objects.
      @date         12/8/2018
 
         Program Change Log 
         ==================
         Name        Date     Description
         Marco       12/8     Create baseline for NumberMath.java
 */
 
public class NumberMath
{
   // INSTANCE VARIABLE DECLARATION
   private Number a;
   private Number b;
   private Number result;
   
   // CLASS CONSTRUCTORS
   public NumberMath(){}
   
   public NumberMath(int integer)
   {
      this.a = new Number(integer);
      this.b = new Number(0);
      this.result = new Number(0);
   }
   
   public NumberMath(double real)
   {
      this.a = new Number(real);
      this.b = new Number(0);
      this.result = new Number(0);
   }
   
   public NumberMath(int integer,double real)
   {
      this.a = new Number(integer,real);
      this.b = new Number(0);
      this.result = new Number(0);
   }
   
   public NumberMath(float real)
   {
      this.a = new Number(real);
      this.b = new Number(0);
      this.result = new Number(0);
   }
   
   public NumberMath(int integer,float real)
   {
      this.a = new Number(integer,real);
      this.b = new Number(0);
      this.result = new Number(0);
   }
   
   public NumberMath(Number number)
   {
      this.a = new Number(number);
      this.b = new Number(0);
      this.result = new Number(0);
   }
   
   public NumberMath(int integerFirst,int integerSecond)
   {
      this.a = new Number(integerFirst);
      this.b = new Number(integerSecond);
      this.result = new Number(0);
   }
   
   public NumberMath(double realFirst,double realSecond)
   {
      this.a = new Number(realFirst);
      this.b = new Number(realSecond);
      this.result = new Number(0);
   }
   
   public NumberMath(int integerFirst,double realFirst,int integerSecond,double realSecond)
   {
      this.a = new Number(integerFirst,realFirst);
      this.b = new Number(integerSecond,realSecond);
      this.result = new Number(0);
   }
   
   public NumberMath(float realFirst,float realSecond)
   {
      this.a = new Number(realFirst);
      this.b = new Number(realSecond);
      this.result = new Number(0);
   }
   
   public NumberMath(int integerFirst,float realFirst,int integerSecond,float realSecond)
   {
      this.a = new Number(integerFirst,realFirst);
      this.b = new Number(integerSecond,realSecond);
      this.result = new Number(0);
   }
   
   public NumberMath(Number numberFirst,Number numberSecond)
   {
      this.a = new Number(numberFirst);
      this.b = new Number(numberSecond);
      this.result = new Number(0);
   }
   
   // CHANGE STATE SERVICES
   public void setA(int integer)
   {
      this.a.setInt(integer);
      this.a.setReal(0.00);
   }
   
   public void setA(float real)
   {
      this.a.setInt((int)real);
      this.a.setReal(real);
   }
   
   public void setA(double real)
   {
      this.a.setInt((int)real);
      this.a.setReal(real);
   }
   
   public void setA(int integer,float real)
   {
      this.a.setInt(integer);
      this.a.setReal(real);
   }
   
   public void setA(int integer,double real)
   {
      this.a.setInt(integer);
      this.a.setReal(real);
   }
   
   public void setB(int integer)
   {
      this.b.setInt(integer);
      this.b.setReal(0.00);
   }
   
   public void setB(float real)
   {
      this.b.setInt((int)real);
      this.b.setReal(real);
   }
   
   public void setB(double real)
   {
      this.b.setInt((int)real);
      this.b.setReal(real);
   }
   
   public void setB(int integer,float real)
   {
      this.b.setInt(integer);
      this.b.setReal(real);
   }
   
   public void setB(int integer,double real)
   {
      this.b.setInt(integer);
      this.b.setReal(real);
   }
   
   public void add()
   {
      this.result.setInt((int)(this.a.getInt() + this.b.getInt()) + (this.a.getReal() + this.b.getReal()));
      this.result.setReal((this.a.getInt() + this.b.getInt()) + (this.a.getReal() + this.b.getReal()));
   }
   
   public void sub()
   {
      this.result.setInt((int)(this.a.getInt() - this.b.getInt()) + (this.a.getReal() - this.b.getReal()));
      this.result.setReal((this.a.getInt() - this.b.getInt()) + (this.a.getReal() - this.b.getReal()));
   }
   
   public void mul()
   {
      this.result.setInt((int)(this.a.getInt() * this.b.getInt()) + (this.a.getReal() * this.b.getReal()));
      this.result.setReal((this.a.getInt() * this.b.getInt()) + (this.a.getReal() * this.b.getReal()));
   }
   
   public void div()
   {
      double temp;
      temp = (this.a.getInt() / this.b.getInt()) + (this.a.getReal() / this.b.getReal());
      this.result.setInt((int)(this.a.getInt() / this.b.getInt()) + (this.a.getReal() / this.b.getReal()));
      this.result.setReal((this.a.getInt() / this.b.getInt()) + (this.a.getReal() / this.b.getReal()));
   }
   // READ STATE SERVICES
   public Number getA()
   {
      return this.a;
   }
   
   public Number getB()
   {
      return this.b;
   }
   
   public Number getResult()
   {
      return this.result;
   }
   
   public String toString()
   {
      return "a = " + this.a.toString() + ", b = " + this.b.toString() + ", result = " + this.result.toString();
   }
}