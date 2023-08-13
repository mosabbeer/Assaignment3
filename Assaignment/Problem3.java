package Assaignment;

public class Problem3
{
    public void CountingDigit(int number)
    {
       int  count=0;
        if(number<0)
            number=number*(-1);
        while(number!=0)
        {
            count++;
           number= number/10;
        }
        System.out.println(count);
    }
}
