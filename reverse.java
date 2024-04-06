import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,r=0,p;
        System.out.println("enter no.");
        x=in.nextInt();
        while(x>0)
        {
            p=x%10;
            r=(r*10)+p;
            x/=10;
        }
        System.out.println(r);
    }
}
