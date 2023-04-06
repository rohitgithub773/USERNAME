import java.io.*;
import java.util.*;

public class USERNAME {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int k=0;
        String s[]=new String[n];
        for(int i=0;i<n;i++)
        s[i]=sc.next();
        for(int i=0;i<n;i++)
        {
          String p=s[i];k=0;
          if(p.length()>=8 && p.length()<=30)
          {
            
            if(Character.isAlphabetic(p.charAt(0))==true)
            {
              for(int j=1;j<p.length();j++)
              {
                char c=p.charAt(j);
              if((Character.isLetterOrDigit(c)==true)||(c=='_'))
              continue;
              else{
              System.out.println("Invalid");
              k++;
              break;
              }
            }
              if(k==0)
               System.out.println("Valid");
            }
            else
            System.out.println("Invalid");
          }
          else 
          System.out.println("Invalid");
        }
    }
}