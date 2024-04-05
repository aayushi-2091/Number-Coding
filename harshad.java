import java.util.*;
public class harshad {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,p,s=0,n;
        System.out.println("enter a number:");
        x=in.nextInt();
        n=x;
        while(x>0)
        {
            p=x%10;
            s=s+p;
            x=x/10;
        }
        x=n;
        if(x%s==0)
        System.out.println("harshad number.");
        else
        System.out.println("not a harshad number.");
    }
}
