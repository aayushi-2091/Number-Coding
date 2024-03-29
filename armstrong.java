import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,p,n,s=0;
        System.out.println("enter a number:");
        x=in.nextInt();
        n=x;
        while(x>0)
        {
            p=x%10;
            s=s+(int)Math.pow(p,3);
            x=x/10;
        }
        x=n;
        if(x==s)
        System.out.println("armstrong");
        else
        System.out.println("not armstrong");
    }
}
