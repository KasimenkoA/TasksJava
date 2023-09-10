package Tasks.Tasks200;

import java.util.Scanner;

public class Task200
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите строку: ");
                String ss = scanner.nextLine();

                char[] mas_ch = ss.toCharArray();
                int nn = 0;
                for (char ch : mas_ch)
                    {
                        if (ch == 'о') nn++;
                    }

                System.out.println("Найдено " + nn + " символов 'о'.");
            }
    }
