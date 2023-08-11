package Tasks.Tasks200;

import java.util.Scanner;

public class Task170
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                int nn;

                boolean simple = true;
                while (simple) {
                    System.out.print("Введите число: ");
                    nn = scanner.nextInt();
                    for (int i = 2; i < nn; i++)
                        {
                            if (nn % i == 0)
                                {
                                    simple = false;
                                    System.out.println("Число не является простым!");
                                    break;
                                }
                        }
                }
            }
    }
