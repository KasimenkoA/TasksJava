import java.util.Scanner;

public class Task16
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );

                System.out.print("Введите число: ");
                int nn = scanner.nextInt();

                String ss = "";

                switch (nn)
                    {
                        case 1:
                            ss = "Понедельник";
                            break;
                        case 2:
                            ss = "Вторник";
                            break;
                        case 3:
                            ss = "Среда";
                            break;
                        default:
                            ss = "Не найдено";
                    }

                System.out.println(ss);
            }
    }
