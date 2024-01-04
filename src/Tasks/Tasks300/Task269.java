package Tasks.Tasks300;

import java.util.Random;

public class Task269
    {
        public static void main( String[] args )
            {
                int nn1;
                int nn2;
                int nn;
                Random random = new Random();

                double ss = 0.0;
                double mm;
                int count = 100;

                for (int i = 0; i < count; i++)
                    {
                        nn1 = random.nextInt(6) + 1;
                        nn2 = random.nextInt(6) + 1;
                        nn = nn1 + nn2;

                        ss += nn;
                        System.out.println(nn);
                    }

                System.out.println();
                mm = ss/count;
                System.out.println(mm);
            }
    }
