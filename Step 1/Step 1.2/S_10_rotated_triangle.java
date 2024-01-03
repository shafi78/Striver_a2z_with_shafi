// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *




public class S_10_rotated_triangle {

    public static void rotatedTriangle(int n) {
        for (int i=1 ; i<=n ; i++) {
            for (int j=1 ; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n-1 ; i>=1 ; i--) {
            for (int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n=5 ;

        rotatedTriangle(n);
    }
}
