package Tasks.Tasks300;

public class Task277
    {
        public static void main( String[] args )
            {
                double[] coins = {1,2,5,10,50};

                double mm = 0.0;
                for (int i = 0; i < coins.length; i++)
                    {
                        mm += coins[i] * 0.5;
                    }

                System.out.println(mm);
            }
    }
