package Tasks.Tasks300;

import java.util.Scanner;

public class Task272
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Input number X: ");
                double X = scanner.nextDouble();

                System.out.print("Input number Y: ");
                double Y = scanner.nextDouble();

                double Z = Math.pow(X , Y) + X/Y;
                System.out.println(Z);
            }
    }
