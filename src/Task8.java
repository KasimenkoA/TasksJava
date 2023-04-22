import java.util.Scanner;

public class Task8
    {
        public static void main( String[] args )
            {
                int nn_cur;
                int nn_sum = 0;
                Scanner scanner = new Scanner( System.in );

                for (int i = 1; i < 4; i++)
                    {
                        System.out.printf("¬ведите %d число: ",i);
                        nn_cur = scanner.nextInt();
                        nn_sum += nn_cur;
                    }

                System.out.println("»того: " + nn_sum);
            }
    }
