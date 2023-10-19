package Tasks.Tasks250;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task231
    {
        public static void main( String[] args )
            {
                Set<Integer> set = new HashSet<>();

                int nn;
                Random random = new Random();

                for (int i = 0; i < 10; i++)
                    {
                        nn = random.nextInt(10);
                        set.add( nn );
                    }

                int even_nn = 0;
                for (Integer integer : set)
                    {
                        System.out.println(integer);

                        if (integer % 2 == 0) even_nn++;
                    }

                System.out.println();
                System.out.println(even_nn);
            }
    }
