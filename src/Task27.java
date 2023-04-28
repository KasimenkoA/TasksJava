import java.util.Scanner;

public class Task27
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );

                String ss;
                System.out.print("¬ведите строку: ");
                ss = scanner.nextLine();

                char[] mas = ss.toCharArray();
                char[] mas2 = new char[mas.length];
                for (int i = 0; i < mas.length; i++)
                    {
                        mas2[mas.length-i-1] = mas[i];
                    }

                String ss_new = new String(mas2);
                System.out.println(ss_new);
            }
    }
