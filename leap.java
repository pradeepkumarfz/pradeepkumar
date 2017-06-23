import java.io.*;
import java.util.*;
class leap
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if((n%400==0)||((n%4==0))&&(n%100!=0))
        {
            System.out.print("Leap year");
        }
        else
        {
            System.out.print("Not a leap year");
        }
    }
}

