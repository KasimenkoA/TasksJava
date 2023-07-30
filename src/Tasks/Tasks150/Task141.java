package Tasks.Tasks150;

import java.util.Scanner;

public class Task141
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );
                System.out.print("Input number: ");
                int nn = scanner.nextInt();

                if (nn%2 == 1)
                    {
                        System.out.printf("Число %d не является четным.", nn);
                    }
                else
                    {
                        System.out.printf( "Число %d является четным.", nn );
                    }
            }
    }
