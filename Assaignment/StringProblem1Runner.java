package Assaignment;

import Assaignment.StringProblem1;

import java.util.Scanner;

public class StringProblem1Runner
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        StringProblem1 solution = new StringProblem1();
        solution.compare(str);
    }
}
