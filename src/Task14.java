import java.util.Random;

public class Task14
    {
        public static void main( String[] args )
            {
                final int msize = 50;
                int[] mas_a = new int[msize];
                int[] mas_b = new int[msize];

                Random random = new Random();

                for (int i = 0; i < msize; i++)
                    {
                        mas_a[i] = random.nextInt(100);
                    }

                for (int i = 0; i < msize; i++)
                    {
                        mas_b[i] = mas_a[i] * 3;
                        System.out.println(mas_b[i]);
                    }
            }
    }
