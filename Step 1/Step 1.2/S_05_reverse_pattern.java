// * * * * * 
// * * * *
// * * *
// * *
// *



public class S_05_reverse_pattern {

    public static void reversePattern(int n) {
        for (int i=1 ; i<=n ; i++) {
            for (int j=n ; j>=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5 ;

        reversePattern(n);
    }
}
