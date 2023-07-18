import java.util.Scanner;

public class Task148
    {
        public static void main( String[] args )
            {
                String pas = "";

                Scanner scanner = new Scanner(System.in);

                while (!pas.equals( "password"))
                    {
                        System.out.print("¬ведите строку: ");
                        pas = scanner.nextLine();
                    }

                System.out.println("Password is correct!");
            }
    }
