package edu.pacificu.cs.cs260;

import java.util.function.Function;

public class LambdaDemo
{
  public static void displayResult(int x, Function<Integer, Integer> transform)
  {
    System.err.println( transform.apply(x) );
  }

  public static void main (String args[]) {
    displayResult(100, x -> x + x);
  }

}
