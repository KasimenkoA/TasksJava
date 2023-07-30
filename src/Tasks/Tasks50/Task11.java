package Tasks.Tasks50;

import java.util.Random;

public class Task11
    {
        public static void main( String[] args )
            {
                int[] mm = new int[10];

                Random random = new Random();
                for (int i = 0; i < mm.length; i++)
                    {
                        mm[i] = random.nextInt(100);
                    }

                int max_nn = mm[0];
                for (int i = 0; i < mm.length; i++)
                    {
                        if (mm[i] > max_nn) max_nn = mm[i];
                        System.out.println(mm[i]);
                    }

                System.out.println("Максимум: " + max_nn);
            }
    }
