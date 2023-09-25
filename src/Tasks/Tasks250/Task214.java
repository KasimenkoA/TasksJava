package Tasks.Tasks250;

import java.util.Scanner;

public class Task214
    {
        public static void main( String[] args )
            {
                int res;

                Scanner scanner = new Scanner(System.in);
                System.out.print("¬ведите число: ");
                int nn = scanner.nextInt();

                try
                    {
                        res = 10 / nn;
                        System.out.println(res);
                    }
                catch (Exception e)
                    {
                        System.out.println("ќшибка " + e.toString());
                    }
            }
    }
