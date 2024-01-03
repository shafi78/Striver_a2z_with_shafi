import java.util.*;

public class S_01_user_input {

    public static void main(String[] args) {
        System.out.println("Enter your character : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(1);
        }

        else if (ch >= 'a' && ch <= 'z') {
            System.out.println(0);
        }

        else {
            System.out.println(-1);
        }
    }
}