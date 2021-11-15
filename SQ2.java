package _2015;

import java.io.*;
public class SQ2
{
    int a[][];
    int b[][];
    int m;
    void input()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("enter m");
        m=Integer.parseInt(in.readLine());
        a=new int[m][m];
        System.out.println("enter elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=Integer.parseInt(in.readLine());

            }
        }
    }

    void display(int x[][])
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(x[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    void rotate()
    {
        b=new int [m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                b[j][(m-1)-i]=a[i][j];
            }
        }
    }

    void sum()
    {
        int s=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((i==0&&j==0)||(i==0&&j==(m-1))||(i==(m-1)&&j==0)||(i==(m-1)&&j==(m-1)))
                {
                    s=s+a[i][j];
                }
            }
        }
        System.out.println("sum is "+s);
    }

    static void main()throws IOException
    {
        SQ2 ob=new SQ2();
        ob.input();
        ob.display(ob.a);
        ob.rotate();
        ob.display(ob.b);
        ob.sum();

    }
}
