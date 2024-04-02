import java.util.Scanner;
public class buzz{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x;
        System.out.println("enter a number:");
        x=in.nextInt();
        if(x%10==7||x%7==0)
        System.out.println("buzz number");
        else
        System.out.println("not a buzz number");
    }
}
