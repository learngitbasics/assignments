package package1;

import java.util.Scanner;

public class UserInp {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your name::");
        String str = sc.next();

        System.out.println("Hello Mr."+ str);
    }
}
