package Tasks.Tasks50;

import java.util.Random;

public class Task1
    {
        public static void main( String[] args )
            {
                Random random = new Random();
                int nn = random.nextInt(100);
                System.out.println(nn);

                int nn_new = nn * 3;
                System.out.println(nn_new);
            }
    }
