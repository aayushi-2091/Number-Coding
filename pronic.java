import java.util.*;
public class pronic {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,c=0;
        System.out.println("enter a number");
        n=in.nextInt();
        int x=n;
        int p=n/2;
        for(int i=1;i<=p;i++)
        {
            if((i*(i+1))==n)
            c++;
        }
        if(c==1)
        System.out.println("pronic number");
        else
        System.out.println("not a pronic number");
    }
}
