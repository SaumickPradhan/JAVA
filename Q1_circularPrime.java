package _2016;

public class Q1_circularPrime
{

    void main()
    {
        int n=131;
        int x=n;
        int f=0;
        int s=0;
        String y="";
        int Y=0;
        int ans=0;
        int k=0;
        for(int i=0;i<3;i++)
        {
            f=x/100;
            s=x%100;
            y=s+""+f;
            Y=Integer.parseInt(y);
            System.out.println(Y);
            ans=check(Y);
            if(ans==1)
            {
                k++;
            }
            x=Y;

        }
        if(k==3)
        {
            System.out.println("CP");
        }
        else
        {
            System.out.println("no");
        }
    }

    int check(int Y)
    {
        int c=0;
        for(int i=2;i<Y;i++)
        {
            if(Y%i==0)
            {
                c++;
                break;
            }
        }
        if(c==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

}
