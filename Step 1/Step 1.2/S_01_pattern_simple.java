// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *



public class S_01_pattern_simple {
    public static void simplePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;

        simplePattern(n);
    }
}
