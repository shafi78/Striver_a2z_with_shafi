import java.util.*;

public class S_06_sum_of_even_and_odd {
    public static void main(String args[]) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int even=0 , odd=0 , rem = 0 ;

        while (n>0) {
            rem = n%10 ;

            if (rem%2 == 0) {
                even += rem ;
            }

            else {
                odd += rem ;
            }

            n = n/10 ;
        }

        System.out.println("Even : "+even+" Odd : "+odd);
    }
}
