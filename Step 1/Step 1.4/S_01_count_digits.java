public class S_01_count_digits {

    public static void countDigit(int n) {
        int count = 0 ;

        while (n!=0) {
            int rem = n%10 ;
            
            count += rem ;
            
            n /= 10 ;
        }

        System.out.println(count);
    }

    public static void main(String args[]) {
        int n = 12345 ;

        countDigit(n);
    }
}