import java.util.*;
public class neon {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,p=1,s=0,n;
        System.out.println("enter a number:");
        x=in.nextInt();
        p=x*x;
        while(p>0)
        {
            n=p%10;
            s+=n;
            p=p/10;
        }
        if(x==s)
        System.out.println("neon number.");
        else
        System.out.println("not neon number.");
    }
}