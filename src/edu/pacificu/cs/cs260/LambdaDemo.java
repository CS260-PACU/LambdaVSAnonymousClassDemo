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

    Function<Integer, Integer> decisionFunc =
        x ->
        {
          if (x > 10) {
            return x + x;
          }
          else {
            return x * x;

          }
        };

    displayResult (3, decisionFunc);
  }

}
