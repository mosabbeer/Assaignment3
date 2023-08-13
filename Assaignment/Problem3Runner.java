package Assaignment;

import Assaignment.Problem3;

import java.util.Scanner;

public class Problem3Runner
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();
        Problem3 solution= new Problem3();
        solution.CountingDigit(number );
    }
}
