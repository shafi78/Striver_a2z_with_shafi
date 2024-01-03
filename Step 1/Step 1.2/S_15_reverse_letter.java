// A B C D E 
// A B C D
// A B C
// A B
// A




public class S_15_reverse_letter {

    public static void reverseLetter(int n) {
        for (int i=n-1 ; i>=0 ; i--) {
            for (char ch='A' ; ch<='A'+i ; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n=5 ;

        reverseLetter(n);
    }
}
