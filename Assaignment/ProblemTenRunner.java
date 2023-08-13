package Assaignment;

import Assaignment.ProblemTen;

import java.util.Scanner;

public class ProblemTenRunner
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=  sc.nextInt();
        int b = sc.nextInt();
        int c =  sc.nextInt();
        int d =  sc.nextInt();
        ProblemTen solve = new ProblemTen();
        solve.compare(a,b,c,d);
    }
}
