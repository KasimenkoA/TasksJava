package Tasks.Tasks250;

import java.util.Scanner;

public class Task201
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Input string: ");
                String ss = scanner.nextLine();

                char ch = ss.charAt( 0 );
                if (ch == 'L')
                    {
                        System.out.println(ss.toLowerCase());
                    }
                if (ch == 'u')
                    {
                        System.out.println(ss.toUpperCase());
                    }
            }
    }
