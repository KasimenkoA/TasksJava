package Tasks.Tasks50;

import java.util.Scanner;

public class Task28
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );
                System.out.print("¬ведите строку: ");
                String ss = scanner.nextLine();

                char[] mas = ss.toCharArray();
                char[] mas_int = new char[mas.length];

                for (int i = 0; i < mas.length; i++)
                    {
                        if (Character.isDigit( mas[i] )) mas_int[i] = mas[i];
                    }

                String ss_new = new String(mas_int);
                System.out.println("" + ss_new);
            }
    }
