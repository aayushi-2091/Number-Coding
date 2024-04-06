import java.util.*;
public class spy {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,r,p=1,s=0;
        System.out.println("enter no");
        x=in.nextInt();
        while(x>0)
        {
            r=x%10;
            p=p*r;
            s=s+r;
            x=x/10;
        }
        if(s==p)
        System.out.println("spy no.");
        else
        System.out.println("not a spy no.");
    }
}
