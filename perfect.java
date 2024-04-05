import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,s=0;
        System.out.println("enter a number:");
        x=in.nextInt();
        for(int i=1;i<=x/2;i++)
        {
            if(x%i==0)
            s=s+i;
        }
        if(x==s)
        System.out.println("perfect number.");
        else
        System.out.println("not a perfect number.");
    }
}