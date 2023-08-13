package Assaignment;

public class StringProblem1
{
    public void compare(String str)
    {
        int n=str.length();
        if(str.charAt(0)==str.charAt(n-1))
        {
            System.out.println("it is same");
        }
        else
        {
            System.out.println("it is not the same");
        }
    }
}

