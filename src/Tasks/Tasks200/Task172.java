package Tasks.Tasks200;

import java.util.Scanner;

public class Task172
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                String ss;

                for (int i = 0; i < 5; i++)
                    {
                        System.out.print("¬ведите название звер€: ");
                        ss = scanner.nextLine();
                        if (ss.startsWith( "в" )) continue;

                        System.out.println("«верь " + ss + ".");
                    }
            }
    }
