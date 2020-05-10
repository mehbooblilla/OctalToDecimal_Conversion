package Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//       java program to convert Octal to Decimal:
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Octal number:");
        String octalNumber=scanner.next();
        int decimalNumber=Integer.parseInt(octalNumber,8);
        System.out.println("Octal to Decimal conversion:");
        System.out.println("Decimal Output: "+ decimalNumber);
//     java program to convert Decimal to Octal :
        System.out.print("Enter a Decimal number:");
        int decNumber=scanner.nextInt();
        String octalNumber1=Integer.toOctalString(decNumber);
        System.out.println("Decimal to Octal conversion:");
        System.out.println("Octal output: "+ octalNumber1);

    }
}
