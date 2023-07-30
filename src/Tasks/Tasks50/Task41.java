package Tasks.Tasks50;

import java.util.Random;

public class Task41
    {
        public static void main( String[] args )
            {
                Random random = new Random();

                int sum = 0;
                while (sum<=1000)
                    {
                        int nn = random.nextInt(10);
                        sum += nn;
                        System.out.println(nn);
                    }

                System.out.println();
                System.out.println("Sum: " + sum);
            }
    }
