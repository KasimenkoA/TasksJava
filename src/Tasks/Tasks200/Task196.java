package Tasks.Tasks200;

import java.util.Scanner;

public class Task196
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("¬ведите любой символ: ");
                String ss = scanner.nextLine();

                char ch = ss.charAt( 0 );
                if (ch == 'о' || ch == 'а' || ch == 'к')
                    {
                        System.out.println(Character.toUpperCase( ch ));
                    }
            }
    }
