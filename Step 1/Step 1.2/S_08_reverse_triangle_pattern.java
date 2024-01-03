// *********
//  *******
//   *****
//    ***
//     *


public class S_08_reverse_triangle_pattern {
    public static void trianglePattern(int n) {
        for (int i=n ; i>=1 ; i--) {
            for (int j=1 ; j<=n-i ; j++) {
                System.out.print(" ");
            }

            for (int j=1 ; j<=2*(i-1)+1 ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n=5 ;
        trianglePattern(n);
    }
}
