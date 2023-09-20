package Tasks.Tasks250;

import java.util.Scanner;

public class Task210
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);

                System.out.print("¬ведите ваше им€: ");
                String ss1 = scanner.nextLine();

                System.out.print("¬ведите ваш возраст: ");
                String ss2 = scanner.nextLine();

                System.out.printf("¬ас зовут %s, вам %s лет.", ss1,ss2);
            }
    }
