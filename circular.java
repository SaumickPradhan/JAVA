package _2019;

import java.io.*;
public class circular
{
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a[][]=new int [4][4];
        int b[]=new int [16];
        int t=0;
        for(int i=0;i<16;i++)
        {
            b[i]=Integer.parseInt(in.readLine());
        }
        for(int i=3,j=0;i>0;i--,j++)
        {
            for(int k=j;k<i;k++)
            {
                a[j][k]=b[t++];
            }
            for(int k=j;k<i;k++)
            {
                a[k][i]=b[t++];
            }
            for(int k=i;k>j;k--)
            {
                a[i][k]=b[t++];
            }
            for(int k=i;k>j;k--)
            {
                a[k][j]=b[t++];
            }
            if(4%2==1)
            {
                a[(4-1)/2][(4-1)/2]=b[t++];
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

