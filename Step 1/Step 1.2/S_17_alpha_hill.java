//     A    
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA



public class S_17_alpha_hill {

    public static void alphaHill(int n) {
        // Write your code here

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                System.out.print(" ");
            }

            char ch = 'A';

            int breakpoint = (2 * i + 1) / 2;

            for (int j = 1; j <= 2 * i + 1; j++) {

                System.out.print(ch);

                if (j <= breakpoint)
                    ch++;

                else
                    ch--;
            }

            for (int j = 0; j < n - i - 1; j++) {

                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;

        alphaHill(n);
    }
}
