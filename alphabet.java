import java.io.*;
import java.util.*;
class alphabet
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        char[] b=a.toCharArray();
        for(int i=0;i<1;i++)
        {
        if(Character.isLetter(b[i]))
        {
         System.out.print("alphabet");   
        }
        else
        {
            System.out.print("digit");
        }
        }
        
    }
}
