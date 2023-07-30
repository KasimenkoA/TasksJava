package Tasks.Tasks150;

import java.util.Scanner;

public class Task144
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );

                System.out.print("Введите ваш возраст: ");
                int age = scanner.nextInt();

                System.out.print("Введите ваш уровень катания на коньках: (1 - BEGINNER, 2 - MEDIUM, 3 - ADVANCED) ");
                int level = scanner.nextInt();

                if (age > 5 && level > 1)
                    {
                        System.out.println("Вы можете пойти на каток.");
                    }
                else
                    {
                        System.out.println("Вы не можете пойти на каток.");
                    }
            }
    }


