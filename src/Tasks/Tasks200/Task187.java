package Tasks.Tasks200;

import java.util.Random;

public class Task187
    {
        public static void main( String[] args )
            {
                int nn;
                Random random = new Random();

                int mm = Integer.MAX_VALUE;
                for (int i = 0; i < 10; i++)
                    {
                        nn = random.nextInt(100);
                        System.out.println(nn);

                        mm = Math.min( mm,nn );
                    }

                System.out.println();
                System.out.println(mm);
            }
    }
