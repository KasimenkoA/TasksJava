package Tasks.Tasks300;

import java.util.Random;

public class Task279
    {
        public static void main( String[] args )
            {
                int len = 8;
                int[][] mm = new int[len][len];

                int nn;
                Random random = new Random();

                for (int i = 0; i < len; i++)
                    {
                        for (int j = 0; j < len; j++)
                            {
                                mm[i][j] = random.nextInt(7) + 1;
                            }
                    }

                for (int i = 0; i < 8; i++)
                    {
                        System.out.println(mm[i][i]);
                    }
            }
    }
