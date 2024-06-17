import java.util.Scanner;

public class hello2 {
    public static void main(String[] args) {
        char a;
        Scanner vy = new Scanner(System.in);
        System.out.println("Enter the no:");
        a = vy.next().charAt(0);
        if (a >= 'a' && a <= 'z') {
            System.out.println("Lowercase");
        } else if (a >= 'A' && a <= 'Z') {
            System.out.println("UPPERCASE");
        } else {
            System.out.println("It is digital no");
        }

    }
}
