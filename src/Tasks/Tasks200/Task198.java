package Tasks.Tasks200;

import java.util.Scanner;

public class Task198
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                String ss;

                while (true)
                    {
                        System.out.print("¬ведите строку: ");
                        ss = scanner.nextLine();

                        if (ss.compareTo( "exit" ) == 0) break;
                    }
            }
    }
