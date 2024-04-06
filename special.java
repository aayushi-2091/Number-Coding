import java.util.*;
public class special{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,p,f=1,s=0,n;
        System.out.println("enter no.");
        x=in.nextInt();
        n=x;
        while(x>0)
        {
            p=x%10;
            for(int i=1;i<=p;i++)
            {
                f=f*i;
            }
            s=s+f;
            f=1;
            x=x/10;
        }
        x=n;
        if(s==x)
        System.out.println("special number");
        else
        System.out.println("not a special number");
    }
}