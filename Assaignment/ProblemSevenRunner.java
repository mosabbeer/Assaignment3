package Assaignment;

import Assaignment.ProblemSeven;

import java.util.Scanner;

public class ProblemSevenRunner
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int a =sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
        ProblemSeven solve = new ProblemSeven();
        solve.compare(a,b,c);
    }
}
