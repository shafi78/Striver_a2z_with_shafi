public class S_03_digit_divides_evenly {
    
    public static void divideEvenly(int n) {
        int count = 0;
        int number = n;

        while (n != 0) {
            int rem = n % 10;
            n /= 10;

            if (rem == 0) {
                continue;
            }

            if (number % rem == 0) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String args[]) {
        int n = 336;

        divideEvenly(n);
    }
}
