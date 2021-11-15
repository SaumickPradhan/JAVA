import java.io.*;
public class valid
{
    int n;
    valid()
    {
        n=0;
    }

    void getnum(int nn)
    {
        n=nn;
    }

    void sumdig()
    {
        int s=0;

        int r;
        while(s>=10)
        {

            while(n!=0)
            {
                r=n%10;
                s=s+r;
                n=n/10;
            }
            if(s!=10)
            {
                s=n;
            }
            else 
            {
                break;
                
            }
        }
              
        if(s==10)
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println(" not valid"); 

        }
    }

    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in); 
        BufferedReader in=new BufferedReader(read)   ;
        System.out.println("enter no");
        n=Integer.parseInt(in.readLine());
        valid ob=new valid();

        ob.sumdig();
    }
}