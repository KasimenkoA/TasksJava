package Tasks.Tasks200;

import java.util.Scanner;

public class Task188
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Введите число 1: ");
                int nn1 = scanner.nextInt();

                System.out.print("Введите число 2: ");
                int nn2 = scanner.nextInt();

                System.out.print("Введите число 3: ");
                int nn3 = scanner.nextInt();

                int mm = Integer.MIN_VALUE;

                mm = Math.max( mm, nn1 );
                mm = Math.max( mm, nn2 );
                mm = Math.max( mm, nn3 );

                System.out.println("Максимальное число: " + mm);
            }
    }
