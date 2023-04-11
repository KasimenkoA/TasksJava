import java.util.Scanner;

public class Task3
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );

                System.out.print("Введите ваше имя: ");
                String name = scanner.nextLine();

                System.out.print("Введите возраст: ");
                int age = scanner.nextInt();

                System.out.printf("Вас зовут %s. Ваш возраст %d лет.", name, age);
            }
    }
