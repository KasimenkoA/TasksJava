package Tasks.Tasks200;

import java.util.Scanner;

public class Task165
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );
                System.out.print( "¬ведите число: " );
                int nn = scanner.nextInt();

                int mm = 2;
                int mul;
                do
                    {
                        mul = nn * mm;
                        System.out.println( "" + nn + " * " + mm + " = " + mul );
                        mm++;
                    } while (mm < 10);
            }
    }
