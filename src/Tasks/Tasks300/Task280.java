package Tasks.Tasks300;

import java.util.Random;

public class Task280
    {
        public static void main( String[] args )
            {
                double[] cards = {6,7,8,9,10,2,3,4,11,6,7,8,9,10,2,3,4,11,6,7,8,9,10,2,3,4,11,6,7,8,9,10,2,3,4,11,};
                double mm = 7;

                int nn;
                Random random = new Random();

                double ss;
                double sum_ss = 0;
                double mat_exp;

                for (int i = 0; i < 1000; i++)
                    {
                        ss = 0;
                        while (true) {
                            nn = random.nextInt(36);
                            ss += cards[nn];

                            if (ss > 21) {
                                ss = 0;
                                continue;
                            }

                            if ((ss + mm) > 21) break;
                        }
                        System.out.println(ss);
                        sum_ss += ss;
                    }

                mat_exp = sum_ss/1000;
                System.out.println("Mathematical expectation: " + mat_exp); // 17.5
            }
    }
