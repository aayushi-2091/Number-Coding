import java.util.Scanner;
public class duck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,n;
        boolean flag=false;
        System.out.println("enter a number:");
        x=in.nextInt();
        n=x;
        while(x>0){
            int p=x%10;
            if(p==0)
            {
                flag=true;
                break;
            }
            x=x/10;
        }
        if(flag)
        System.out.println("duck number");
        else
        System.out.println("not a duck number");
    }
}