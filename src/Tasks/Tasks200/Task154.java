package Tasks.Tasks200;

import java.util.Scanner;

public class Task154
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите число: ");
                int nn = scanner.nextInt();

                int ff = 1;
                for (int i = 1; i <= nn ; i++)
                    {
                        ff *= i;
                    }

                System.out.println("Факториал числа " + nn + " равен " + ff);
            }
    }
