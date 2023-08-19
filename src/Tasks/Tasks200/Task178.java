package Tasks.Tasks200;

import java.util.Scanner;

public class Task178
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите номер времени года: ");
                int nn = scanner.nextInt();

                switch (nn)
                    {
                        case 1:
                            System.out.println("Зима");
                            break;
                        case 2:
                            System.out.println("Весна");
                            break;
                        case 3:
                            System.out.println("Лето");
                            break;
                        case 4:
                            System.out.println("Осень");
                            break;
                        default:
                            System.out.println("Не определено");
                    }
            }
    }
