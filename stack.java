
import java.io.*;
public class stack
{
    int n;
    int top;
    int stk[]=new int[5];
    void main()throws IOException
    {
        top=-1;
        InputStreamReader read=new InputStreamReader(System.in); 
        BufferedReader in=new BufferedReader(read)   ;
        System.out.println("enter nos");
        for(int i=0;i<5;i++)
        {
            n=Integer.parseInt(in.readLine());
            push(n);
        }
        for(int i=0;i<2;i++)
        { 
            pop();
        }
        
    }

    void push(int n)
    {
        if(top==4)
        {
            System.out.println("stalk full");
        }    
        else
        {
            top++;
            stk[top]=n;
            

        }
       
    }

    void pop()
    {
        int m;
        if(top==-1)
        {
            System.out.println("stalk empty");
        }    
        else
        {
            m=stk[top];
            System.out.println(m);
            top--;
          
        }
    }
    /*void display()
    {
        for(int i=0;i<=top;i++)
        
        System.out.println(stk[i]);
    }*/

} 