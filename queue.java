import java.io.*;
public class queue
{int que[]=new int[5];

    int f;int r;int n;
    void main()throws IOException
    {

        r=-1;
        f=-1;

        InputStreamReader read=new InputStreamReader(System.in); 
        BufferedReader in=new BufferedReader(read)   ;
        System.out.println("enter nos");
        for(int i=0;i<5;i++)
        {
            n=Integer.parseInt(in.readLine());
            insert(n);
        }
        for(int i=0;i<2;i++)
        {

            delete();
        }

    }

    void insert(int n)
    {
        if(r==5)
        {
            System.out.println("full");
        }
        else
        {
            if(f==-1&&r==-1)
            {
                f=0;r=0;
            }
            que[r]=n;
            r++;
        }
    }

    void delete()
    {
        if(f==-1&&r==-1)
        {   System.out.println("empty");
        }
        else
        {
            if(f==r)
            {
                f=0;
                r=0;
            }
            else
            {
                int m=que[f];
                System.out.println(m);
                f++;

            } 
        }
    }
}