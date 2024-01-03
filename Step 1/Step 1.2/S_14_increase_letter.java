// A 
// A B
// A B C
// A B C D
// A B C D E




public class S_14_increase_letter {

    public static void increaseLetter(int n) {
        for (int i=0 ; i<n ; i++) {
            for (char ch='A' ; ch<='A'+i ; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n=5 ;

        increaseLetter(n);
    }
}
