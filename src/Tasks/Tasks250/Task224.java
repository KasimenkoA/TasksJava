package Tasks.Tasks250;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task224
    {
        public static void main( String[] args )
            {
                Set<Integer> numset = new HashSet<>();

                int nn;
                Random random = new Random();

                for (int i = 0; i < 10; i++)
                    {
                        nn = random.nextInt(10);
                        numset.add( nn );
                    }

                for (Integer integer : numset)
                    {
                        System.out.println(integer);
                    }
                System.out.println("Size: " + numset.size());
            }
    }
