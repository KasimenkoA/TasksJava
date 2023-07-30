package Tasks.Tasks50;

import java.util.Scanner;

public class Task25
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );
                int nn;

                while (true)
                    {
                        System.out.print("Введите число: ");
                        nn = scanner.nextInt();

                        if (nn == 9)
                            {
                                System.out.println("Выход.");
                                break;
                            }
                        else {
                            nn++;
                            System.out.println("Следующее число: " + nn);
                        }
                    }
            }
    }
