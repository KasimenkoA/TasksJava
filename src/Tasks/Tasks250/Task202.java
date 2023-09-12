package Tasks.Tasks250;

import java.util.Scanner;

public class Task202
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("¬ведите строку: ");
                String ss = scanner.nextLine();

                System.out.println(ss.length());

                String ss2 = ss.trim();
                System.out.println(ss2);
                System.out.println(ss2.length());
            }
    }
