package Assaignment;

import Assaignment.ProblemNine;

import java.util.Scanner;

public class ProblemNineRunner
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =  sc.nextInt();
        int c =  sc.nextInt();
        ProblemNine solution = new ProblemNine();
        solution.solution(a,b,c);
    }
}
