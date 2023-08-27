package Tasks.Tasks200;

import java.util.Random;

public class Task186
    {
        public static void main( String[] args )
            {
                double rr;
                int nn;
                Random random = new Random();

                for (int i = 0; i < 10; i++)
                    {
                        nn = random.nextInt(10_000);
                        System.out.println(nn);
                        rr = nn / 1000.0;
                        System.out.println(rr);
                        rr = Math.round( rr * 100.0 ) / 100.0;
                        System.out.println(rr);
                        System.out.println();
                    }

            }
    }
