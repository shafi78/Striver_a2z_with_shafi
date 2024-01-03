import java.util.*;
public class S_02_data_type {

    public static int checkType(String type) {
        if (type.equals("Integer") || type.equals("Float")) {
            return 4;
        }
        
        else if (type.equals("Double") || type.equals("Long")) {
            return 8;
        }
        
        else {
            return 1;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Enter data type : ");
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        
        System.out.println(checkType(type));
    }
}