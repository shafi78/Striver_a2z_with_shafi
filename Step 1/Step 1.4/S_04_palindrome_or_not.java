public class S_04_palindrome_or_not {

    public static boolean palindromicNumber(int n) {
        int rev = 0 ;
        int number = n ;

        while (n>0) {
            int rem = n%10 ;
            rev = rev * 10 + rem ;
            n /= 10 ;
        }
        
        if (rev == number) {
            return true ;
        }

        else {
            return false ;
        }
    }

    public static void main(String args[]) {
        int n = 121 ;

        System.out.println(palindromicNumber(n));
    }
}
