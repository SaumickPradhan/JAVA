package _2019;

public class SQ1
{
    int no=255;
    int y=2018;
    int N=22;
    void main()
    {
        String m[]={"","jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
        int md[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(y%400==0||((y%100!=0)&&(y%4==0)))
        {
            md[2]=29;
        }
        int days=1;
        int date=1;
        int month=1;
        while(days<no)
        {
            days++;
            date++;
            if(date>md[month])
            {
                date=1;
                month++;
                if(month>12)
                {

                    y++;
                    if(y%400==0||((y%100!=0)&&(y%4==0)))
                    {
                        md[2]=29;
                    }
                    month=1;
                    date=1;
                }

            }
        }
        if(no==days)
        {
            String suff="th";
            if((date%10==1)&&(date!=11))
            {
                suff="st";
            }
            else if((date%10==2)&&(date!=12))
            {
                suff="nd";
            }
            else if((date%10==3)&&(date!=13))
            {
                suff="rd";
            }
            System.out.println(date+""+suff+" "+m[month]+" "+y);

        }
        int D=date;
        int M=month;
        int Y=y;
        int dd=0;
        while(dd<N)
        {
            dd++;
            D++;
            if(D>md[M])
            {
                D=1;
                M++;
                if(M>12)
                {
                    Y++;
                    if(Y%400==0||((Y%100!=0)&&(Y%4==0)))
                    {
                        md[2]=29;
                    }
                    M=1;
                    D=1;

                }
            }
        }
        if(N==dd)
        {
            String suff="th";
            if((D%10==1)&&(D!=11))
            {
                suff="st";
            }
            else if((D%10==2)&&(D!=12))
            {
                suff="nd";
            }
            else if((D%10==3)&&(D!=13))
            {
                suff="rd";
            }
            System.out.println(D+""+suff+" "+m[M]+" "+Y);
        }
    }
}
