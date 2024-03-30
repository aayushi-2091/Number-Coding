import java.util.Scanner;
public class automorphic {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,p,n,c=0,s=1;
        System.out.println("enter a number:");
        x=in.nextInt();
        n=x;
        while(x>0)
        {
            p=x%10;
            c++;
            x=x/10;
        }
        x=n;
        s=x*x;
        int r=s%(int)Math.pow(10,c);
        if(r==x)
        System.out.println("automorphic");
        else
        System.out.println("not automorphic");
    }
}