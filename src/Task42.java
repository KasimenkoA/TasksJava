import java.util.Random;

public class Task42
    {
        public static void main( String[] args )
            {
                int sum = 1000;
                int oper_count = 0;

                Random random = new Random();
                int nn = 0;

                while (sum>0)
                    {
                        nn = random.nextInt(10);
                        sum -= nn;
                        oper_count++;
                        System.out.println(nn);
                    }

                System.out.println();
                System.out.println("sum: " + sum);
                System.out.println("count: " + oper_count);
            }
    }
