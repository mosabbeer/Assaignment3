package Assaignment;

import Assaignment.ProblemOne;

import java.util.Scanner;

public class ProblemOneRunner
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       ProblemOne solution = new ProblemOne();
       solution.chackingNumber(number);
    }
}
