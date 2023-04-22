import java.util.Scanner;

public class Task15
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );

                System.out.print("Введите число: ");
                int nn = scanner.nextInt();

                String ss = "Не найдено";
                if (nn == 1) ss = "Понедельник";
                if (nn == 2) ss = "Вторник";
                if (nn == 3) ss = "Среда";

                System.out.println(ss);
            }
    }
