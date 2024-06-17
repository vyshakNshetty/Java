import java.util.Scanner;

public class hello1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner vy=new Scanner(System.in);
        System.out.println("Enter the no:");
        a=vy.nextInt();
        b=vy.nextInt();
        c=vy.nextInt();
        if(a>b)
        {
            System.out.println("a is big");
        }
        else if(b>c)
        {
            System.out.println("b is big");
        }
        else {
            System.out.println("c is big");
        }

    }
}
