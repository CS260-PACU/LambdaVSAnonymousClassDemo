package edu.pacificu.cs.cs260;

public class UseAnonClass
{

  public static void useAnonClass(SimpleInterface obj)
  {
    System.err.println(obj.op1(1));
    System.err.println(obj.op2(1.1));
  }


  public static void main(String args[]) {

    useAnonClass(
        new SimpleInterface() {
          @Override
          public int op1 (int x)
          {
            return x + 1;
          }
          @Override
          public double op2(double x)
          {
            return x + 1.1;
          }
        });


  }
}
