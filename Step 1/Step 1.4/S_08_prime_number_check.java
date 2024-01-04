public class S_08_prime_number_check {

    public static String checkPrime(int n) {
        if (n == 1) {
            return "NO";
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String args[]) {
        int n = 277;

        System.out.println(checkPrime(n));
    }
}
