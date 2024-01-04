public class S_07_sum_of_all_divisiors {

    public static int sumDivisors(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * (n / i);
        }

        return sum;
    }

    public static void main(String args[]) {
        int n = 5;

        System.out.println(sumDivisors(n));
    }
}
