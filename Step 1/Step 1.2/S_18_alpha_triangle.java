// E 
// D E
// C D E
// B C D E
// A B C D E



public class S_18_alpha_triangle {

    public static void alphaTriangle(int n) {

        for (int i = 0; i < n; i++) {
            
            for (char ch = (char) (int) ('A' + n - 1 - i); ch <= (char) (int) ('A' + n - 1); ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;

        alphaTriangle(n);
    }
}
