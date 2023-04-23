import java.util.Scanner;

public class Task22
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );

                System.out.print("Введите число: ");
                int nn = scanner.nextInt();

                int nn_rest = nn % 2;
                System.out.println("Остаток: " + nn_rest);

                if (nn_rest == 0)
                    {
                        System.out.println("Четное");
                    }
                else
                    {
                        System.out.println("Нечетное");
                    }
            }
    }
