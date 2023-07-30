package Tasks.Tasks50;

import java.util.Scanner;

public class Task30
    {
        public static void main( String[] args )
            {
                String name = requestName();
                int age = requestAge();

                System.out.println("Тебя зовут " + name + ", тебе " + age + " лет.");
            }

        private static String requestName()
            {
                Scanner scanner = new Scanner( System.in );
                System.out.print("Как твое имя: ");
                return scanner.nextLine();
            }

        private static int requestAge()
            {
                Scanner scanner = new Scanner( System.in );
                System.out.print("Сколько тебе лет: ");
                return scanner.nextInt();
            }
    }
