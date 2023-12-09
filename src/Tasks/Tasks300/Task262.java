package Tasks.Tasks300;

import java.util.Scanner;

enum Months262 {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

public class Task262
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("¬ведите число: ");
                int nn = scanner.nextInt();

                System.out.println(Months262.values()[nn-1]);
            }

    }
