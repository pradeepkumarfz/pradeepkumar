import java.io.*;
import java.util.*;
class vow
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        char[] b=a.toCharArray();
        for(int i=0;i<1;i++)
        {
        if(b[i]=='a'||b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u')
        {
         System.out.print("vowel");   
        }
        else
        {
            System.out.print("consonant");
        }
        }
        
    }
}
