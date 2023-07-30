package Tasks.Tasks150;

import java.util.Scanner;

public class Task147
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );
                System.out.print("¬ведите число: ");
                int nn = scanner.nextInt();

                int ii = 1;
                int rr;
                while (ii <= 10)
                    {
                        rr = nn * ii;
                        System.out.printf("%5d\t * %5d\t = %5d\n", nn, ii, rr);
                        ii++;
                    }
            }
    }
