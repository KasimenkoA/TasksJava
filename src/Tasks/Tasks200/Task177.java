package Tasks.Tasks200;

import java.util.Scanner;

public class Task177
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите оценку от 1 до 5: ");
                int nn = scanner.nextInt();

                switch (nn)
                    {
                        case 1:
                            System.out.println("Плохо");
                            break;
                        case 2:
                            System.out.println("Удовлетворительно");
                            break;
                        case 3:
                            System.out.println("Хорошо");
                            break;
                        case 4:
                            System.out.println("Отлично");
                            break;
                        case 5:
                            System.out.println("Супер");
                            break;
                        default:
                            System.out.println("Не определено");
                    }
            }
    }
