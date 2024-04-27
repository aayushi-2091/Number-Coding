import java.util.*;
public class unique {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,n1,r1,r2,c=0;
        System.out.println("enter a no.:");
        n=in.nextInt();
        n1=n;
        while(n>0){
            r1=n%10;
            while (n1>0) {
                r2=n1%10;
                if(r1!=r2)
                    c++;
                n1/=10;
            }
            n/=10;
        }
        if(c==1)
        System.out.println("unique number.");
        else
        System.out.println("not a unique number.");
    }
}
