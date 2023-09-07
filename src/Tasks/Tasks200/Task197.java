package Tasks.Tasks200;

import java.util.Scanner;

public class Task197
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("¬ведите строку: ");
                String ss = scanner.nextLine();

                char ch = ss.charAt( 1 );
                System.out.println(Character.toLowerCase( ch ));
            }
    }
