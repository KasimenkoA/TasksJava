package Tasks.Tasks300;

import java.util.Random;

public class Task268
    {
        public static void main( String[] args )
            {
                int nn;
                Random random = new Random();

                double ss = 0.0;
                double mm;
                int count = 100;

                for (int i = 0; i < count; i++)
                    {
                        nn = random.nextInt(6);
                        nn = nn + 1;
                        ss += nn;
                        System.out.println(nn);
                    }

                System.out.println();
                mm = ss/count;
                System.out.println(mm);
            }
    }
