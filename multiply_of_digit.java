import java.util.*;
public class multiply_of_digit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,p,s=1;
        System.out.println("enter a number:");
        x=in.nextInt();
        while(x>0)
        {
            p=x%10;
            s=s*p;
            x=x/10;
        }
        System.out.println("multiplication of digits:"+s);
    }
}