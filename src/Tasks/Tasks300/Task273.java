package Tasks.Tasks300;

import java.util.Scanner;

public class Task273
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Input distance, km: ");
                double dd = scanner.nextDouble();

                double vv = dd / 1.07;
                System.out.println("In versts: " + vv);

                double mm = dd / 1.6;
                System.out.println("In miles: " + mm);

                double yy = dd / 0.00091;
                System.out.println("In yards: " + yy);
            }
    }
