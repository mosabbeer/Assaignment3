package Assaignment;

public class ProblemTen
{
    public void compare(int a,int b,int c, int d)
    {
        if(a <b)
        {
            int temp=a;
            a=b;
            b=temp;
        }
        if(c <d)
        {
            int temp=c;
            c=d;
            d=temp;
        }
        if(a==c && b==d)
            System.out.println("it is pair");
        else
            System.out.println("not pair");
    }
}
