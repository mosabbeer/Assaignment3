package Assaignment;

import Assaignment.Problem2;

import java.util.Scanner;

public class Problem2Runner {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();
        Problem2 solution =new Problem2();
        solution.chackingnumber(number);
    }
}
