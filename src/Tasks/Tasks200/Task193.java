package Tasks.Tasks200;

import java.util.Scanner;

public class Task193
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("¬ведите вашу фамилию и им€: ");
                String ss = scanner.nextLine();
                char ch;

                for (int i = 0; i < ss.length(); i++)
                    {
                        ch = ss.charAt( i );
                        if (Character.isWhitespace( ch ))
                            {
                                System.out.println("Space position: " + i);
                            }
                    }
            }
    }
