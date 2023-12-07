import java.util.Scanner;

/**
 * exercise1
 */

public class exercise1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string : ");
        String a = sc.nextLine();
        System.out.print("Enter 2nd string : ");
        String b = sc.nextLine();
        sc.close();

        System.out.println("Length of 1st string : " + a.length());

        System.out.println("Length of 2nd string : " + b.length());

        boolean lenCheck = a.length() == b.length();
        if(lenCheck == true){
            System.out.println("Length of both strings are same!");
        }
        else{
            System.out.println("Length of both strings are different!");
        }

        boolean eqCheck = a.equals(b);
        if(eqCheck == true){
            System.out.println("Both strings are same!");
        }
        else{
            System.out.println("Both strings are not same!");
        }

    }
}