package Tasks.Tasks200;

import java.util.Scanner;

public class Task153
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("¬ведите число: ");
                int nn = scanner.nextInt();

                int pp;
                int sum = 0;

                for (int i = 1; i <= 10; i++)
                    {
                        pp = (int) Math.pow( nn,i );
                        sum += pp;

                        System.out.println(pp);
                    }

                System.out.println("»того: " + sum);
            }
    }
