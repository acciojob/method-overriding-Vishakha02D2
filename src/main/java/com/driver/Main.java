package com.driver;

public class Main {
  
  public static void main(String args[]){
    
    B b1 = new B();
    b1.meth();
  }
 }
class A{
  void meth(){
  System.out.println( "Invoking method from class A");
  }
}
class B extends a{
  void meth()
  {
    System.out.println( "Method is overridden in Extendend class B");
  }
}
