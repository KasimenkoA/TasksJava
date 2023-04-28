import java.util.Scanner;

public class Task26
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );

                String ss;
                System.out.print("¬ведите строку: ");
                ss = scanner.nextLine();

                char[] mas = ss.toCharArray();
                for (int i = 0; i < mas.length; i++)
                    {
                        System.out.println(mas[i]);
                    }
            }
    }
