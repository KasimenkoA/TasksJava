package Tasks.Tasks200;

import java.util.Scanner;

public class Task184
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите один символ: ");
                char ch = scanner.nextLine().charAt( 0 );

                String ss = (Character.isDigit( ch ))?"Символ является цифрой" : "Символ не является цифрой";
                System.out.println(ss);
            }
    }
