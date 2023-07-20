import java.util.Scanner;

public class Task150
    {
        public static void main( String[] args )
            {
                int nn = (int) (Math.random()*10);
                int curNN;

                Scanner scanner = new Scanner(System.in);


                while (true)
                    {
                        System.out.print("Введите число: ");
                        curNN = scanner.nextInt();

                        if (curNN == nn)
                            {
                                System.out.println("Поздравляю! Вы угадали число!");
                                break;
                            }
                        else if (curNN < nn)
                            {
                                System.out.println( "Загаданное число больше!" );
                            }
                        else
                            {
                                System.out.println("Загаданное число меньше!");
                            }
                    }
            }
    }
