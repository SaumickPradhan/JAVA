package _2015;
import java.util.*;
public class Q3_VowelConso
{
    String s="Intelligence plus character is education";
    void main()
    {
        StringTokenizer st=new StringTokenizer(s);
        int n=st.countTokens();
        String s[]=new String[n];
        int j=0;
        while(st.hasMoreTokens())
        {
            s[j]=st.nextToken();
            j++;
        }
        String x="";
        char ch=0;
        String f[]=new String[n];
        for(int i=0;i<n;i++)
        {
            x=s[i].substring(1);
            ch=s[i].charAt(0);
            ch=Character.toUpperCase(ch);
            x=ch+""+x;
            s[i]=x;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);

        }

    }
}
