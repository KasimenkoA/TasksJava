package Tasks.Tasks150;

import java.util.Scanner;

public class Task142
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );
                System.out.print("Введите год: ");
                int nn = scanner.nextInt();

                if ((nn % 4 == 0 && nn % 100 != 0) || (nn % 400 == 0))
                    {
                        System.out.printf("Год %d является високосным",nn);
                    }
                else
                    {
                        System.out.printf("Год %d не является високосным",nn);
                    }
            }
    }
