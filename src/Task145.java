import java.util.Scanner;

public class Task145
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );
                System.out.print("Введите ваше имя: ");
                String name = scanner.nextLine();

                char ch = name.charAt( 0 );
                if (ch == 'А' || ch == 'Б')
                    {
                        System.out.println("Ваше имя в начале списка");
                    }
                else
                    {
                        System.out.println("Ваше имя не в начале списка");
                    }
            }
    }
