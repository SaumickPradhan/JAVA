package _2014;

public class SQ1_CompMag
{
    int n=82;
    void main()
    {
        int t=n;
        int r=0;
        int x=0;
        int s=0;
        while(n>9)
        {
            r=n;
            while(r!=0)
            {
                x=r%10;
                s=s+x;
                r=r/10;
            }
            n=s;
            s=0;
        }
        System.out.println(n);
    }

}

