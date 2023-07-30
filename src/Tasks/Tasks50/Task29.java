package Tasks.Tasks50;

import java.util.Random;

public class Task29
    {
        public static void main( String[] args )
            {
                Random random = new Random();

                int xx = random.nextInt(100);
                System.out.println(xx);

                int yy = getX(xx);
                System.out.println(yy);
            }

        private static int getX( int xx )
            {
                return (2*xx + 37);
            }
    }
