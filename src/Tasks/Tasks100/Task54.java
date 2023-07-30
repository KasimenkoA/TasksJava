package Tasks.Tasks100;

import java.util.Random;

public class Task54
    {
        public static void main(String[] args){
            int msize = 100;

            int[] mas1 = new int[msize];
            int[] mas2 = new int[msize];
            int[] mas3 = new int[msize];

            int nn;
            Random random = new Random();

            for (int i = 0; i < msize; i++)
                {
                    nn = random.nextInt(100);
                    mas1[i] = nn;

                    nn = random.nextInt(100);
                    mas2[i] = nn;
                }

            for (int i = 0; i < msize; i++)
                {
                    mas3[i] = mas1[i] + mas2[i];
                    System.out.printf("%3d = %3d + %3d\n",mas3[i], mas1[i], mas2[i]);
                }
        }
    }


