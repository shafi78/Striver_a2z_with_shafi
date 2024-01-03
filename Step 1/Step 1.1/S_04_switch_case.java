import java.util.Scanner;

public class S_04_switch_case {
    public static double areaSwitchCase(int ch, float a) {
        // Write your code here

        switch(ch) {
            case 1: 
            System.out.println("Area of circle : ");
            return Math.PI*a*a;

            case 2:
            System.out.println("Area of square : ");
            return a*a;

            default:
            return 0;
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter your choice : ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        float a = sc.nextFloat();

        System.out.println(areaSwitchCase(ch,a));
    }
}
