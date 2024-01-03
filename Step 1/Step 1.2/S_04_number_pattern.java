// 1 
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5



public class S_04_number_pattern {

    public static void numberPattern(int n) {
        for (int i=1 ; i<=n ; i++) {
            for (int j=1 ; j<=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n=5 ;

        numberPattern(n);
    }
}
