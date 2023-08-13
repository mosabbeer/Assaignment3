package Assaignment;

public class ProblemSeven
{
    public void compare(int a,int b,int c)
    {
        if (a<b && b<c)
            System.out.println("Increasing");
        else if(a>b && b>c)
            System.out.println(" Decreasing");
        else
            System.out.println("Neither");
    }
}
