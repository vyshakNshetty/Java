import java.util.Scanner;

public class hello4 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner vy=new Scanner(System.in);
        System.out.println("Enter the no(nest):");
        a=vy.nextInt();
        b=vy.nextInt();
        c=vy.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is big");
            }
            else
            {
                System.out.println("c is big");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("b is big");
            }
            else {
                System.out.println("c is big");
            }
        }
    }


}
