package Assaignment;

public class ProblemNine
{
    public void solution(int a,int b,int c)
    {
        if(a>b && b>c)
        {
            System.out.println("in order");
        }
        else if(a<b && b<c)
            System.out.println("in order");
        else
            System.out.println("not in order");
    }
}
