public class S_05_gcd_of_a_number {

    public static int GCD(int a,int b) {
        if (b == 0) {
            return a ;
        }

        return GCD(b,a%b);
    }

    public static void main(String args[]) {
        int a = 6 , b = 9 ;

        System.out.println(GCD(a, b));
    }
}
