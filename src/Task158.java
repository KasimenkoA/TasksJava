public class Task158
    {
        public static void main( String[] args )
            {
                double[] mas = new double[40];
                double cur_dd = 0.0;
                for (int i = 0; i < 40; i++)
                    {
                        mas[i] = cur_dd;
                        cur_dd += 0.45;
                    }

                for (double dd : mas)
                    {
                        System.out.println( Math.round( dd*10.0 ) / 10.0 );
                    }
            }
    }
