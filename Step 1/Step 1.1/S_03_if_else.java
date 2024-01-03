import java.util.Scanner;

public class S_03_if_else {

    public static String compareValues(int a,int b) {
        if (a>b){
            return "Greater";
        }
        
        else if (a<b){
            return "Smaller";
        }

        else if (a==b){
            return "Equal";
        }

        return "Enter Valid Number";
    }

    public static void main(String args[]) {
        System.out.println("Enter a & b number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(compareValues(a,b));
    }
}
