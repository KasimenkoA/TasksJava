package Tasks.Tasks50;

import java.util.Scanner;

public class Task24
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );

                System.out.print("Введите ваше имя: ");
                String name = scanner.nextLine();

                System.out.println("Привет, " + name.toUpperCase());
            }
    }
