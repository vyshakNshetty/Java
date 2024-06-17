import java.util.Scanner;

public class hello3 {
    public static void main(String[] args) {
        int unit,amt;
        Scanner vy=new Scanner(System.in);
        System.out.println("Enter the Electricity in units:");
        unit =vy.nextInt();
        if (unit<=50)
        {
            amt=unit*2;
        }
        else if(unit<=150)
        {
            amt=(50*2)+(4*(unit-50));
        }
        else if(unit<=250)
        {
            amt=(50*2)+((100*7)+(6*(unit-250)));
        }
        else
        {
            amt=(50*2)+(100*4)+(100*6)+(8*unit-250);
        }
        amt=(int)(amt+(0.2*amt));
        System.out.println("the amount for " +unit+ " used is " +amt);

    }
}
