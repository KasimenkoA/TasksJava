package Tasks.Tasks300;

public class Task278
    {
        public static void main( String[] args )
            {
                double[] cards = {6,7,8,9,10,2,3,4,11};

                double pp = 4.0 / 36.0;
                double m = 0.0;
                double mm = 0.0;

                for (double card : cards)
                    {
                        m = card * pp;
                        System.out.println(m);
                        mm += m;
                    }

                System.out.println("mm = " + mm);
                double mmm = mm * 3;
                System.out.println("Mathematical expectation: " + mmm);
            }
    }
