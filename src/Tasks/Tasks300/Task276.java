package Tasks.Tasks300;

import java.util.Arrays;

public class Task276
    {
        public static void main( String[] args )
            {
                int[] points = {10,9,8,7,6,5,4,3,2,1,0};
                double[] pp = new double[11];
                pp[0] = 0.01;
                pp[1] = 0.03;
                pp[2] = 0.05;
                pp[3] = 0.07;
                pp[4] = 0.12;
                pp[5] = 0.26;
                pp[6] = 0.23;
                pp[7] = 0.07;
                pp[8] = 0.07;
                pp[9] = 0.05;
                pp[10] = 0.04;

                System.out.println(Arrays.stream( pp ).sum());
                System.out.println();

                double mm = 0.0;
                double mm_ = 0.0;
                for (int i = 0; i < 10; i++)
                    {
                        mm_ = points[i] * pp[i];
                        System.out.println(mm_);

                        mm += mm_;
                    }

                System.out.println();
                System.out.println("Mathematical expectation: " + mm);
            }
    }
