package Tasks.Tasks300;

import java.util.Scanner;

public class Task259
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("¬ведите число: ");
                int nn = scanner.nextInt();

                int n1 = 5;
                int n2 = 1;

                int n1_num;
                int n2_num;

                n1_num = nn / n1;
                n2_num = (nn - n1 * n1_num) / n2;

                System.out.println("" + n1 + " - count: " + n1_num);
                System.out.println("" + n2 + " - count: " + n2_num);
            }
    }
