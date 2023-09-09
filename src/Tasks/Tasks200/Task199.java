package Tasks.Tasks200;

import java.util.Scanner;

public class Task199
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                String ss;
                String sb;

                while (true)
                    {
                        System.out.print("¬ведите строку: ");
                        ss = scanner.nextLine();

                        if (ss.length() < 5) continue;

                        sb = ss.substring( 1,5 );
                        System.out.println(sb);
                        if (sb.equals( "exit" ) || sb.equals( "stop" )) break;
                    }
            }
    }
