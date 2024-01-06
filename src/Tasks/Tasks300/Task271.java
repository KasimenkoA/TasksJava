package Tasks.Tasks300;

import java.util.Scanner;

public class Task271
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Input number: ");
                int X = scanner.nextInt();

                int Y = X + X * X;
                System.out.println(Y);
            }
    }
