import java.util.*;

public class S_05_nth_fibonacci {

    public static int fibonacci(int n) {
        if (n == 0 || n == 1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String args[]) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
    }
}
