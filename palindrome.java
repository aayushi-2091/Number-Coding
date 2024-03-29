import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,n,p,s=0;
        System.out.println("Enter a number: ");
        x=in.nextInt();
        n=x;
        while(x>0)
        {
            p=x%10;
            s=(s*10)+p;
            x=x/10;
        }
        x=n;
        if(x==s)
        System.out.println("palindrome.");
        else
        System.out.println("not palindrome.");
    }
}

