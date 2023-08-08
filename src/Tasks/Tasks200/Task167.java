package Tasks.Tasks200;

import java.util.Scanner;

public class Task167
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);

                String ss;
                while (true) {
                    System.out.print("Введите строку: ");
                    ss = scanner.nextLine();

                    if (ss.equals( "стоп" ))
                        {
                            System.out.println("Вы ввели слово стоп!");
                            break;
                        }
                }
            }
    }
