package Tasks.Tasks200;

public class Task190
    {
        public static void main( String[] args )
            {
                double rr;
                double sr;

                for (int i = 0; i < 10; i++)
                    {
                        rr = Math.random()*100;
                        sr = Math.sqrt( rr );
                        System.out.println("Square root from " + rr + " is " + sr);
                    }
            }
    }
