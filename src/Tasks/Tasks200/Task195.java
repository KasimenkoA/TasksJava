package Tasks.Tasks200;

import java.util.Scanner;

public class Task195
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите любую строку: ");
                String ss = scanner.nextLine();

                if (Character.isLowerCase( ss.charAt( 0 ) ))
                    {
                        System.out.println("Ваше слово начинается с маленькой буквы.");
                    }
                else
                    {
                        System.out.println("Ваше слово начинается с большой буквы.");
                    }
            }
    }
