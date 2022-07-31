import java.util.*;
public class practical1_6 {
    public practical1_6() {
    }
    public static void  wordsWithout(String[] a,String b)
    {
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].equals(b))
            {
                count++;
            }
        }
        int l=a.length-count;
        System.out.println("NEW ARRAY:");
        for(int i=0;i<a.length;i++)
        {
                if(a[i].compareTo(b)!=0)
                {
                   System.out.println(a[i]);
                
                }
        }
       
        
    }
    public static void main(String args[])
    {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter length:");
    int n=s.nextInt();
    System.out.println("Enter elements:");
    String s1[]=new String[n];
    for(int i=0;i<(n);i++)
    {
        s1[i]=s.next();
    }
    System.out.println("Enter string :");
    String s2=s.next();
    wordsWithout(s1,s2);
    s.close();
    }
}