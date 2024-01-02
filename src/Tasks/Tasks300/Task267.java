package Tasks.Tasks300;

public class Task267
    {
        public static void main( String[] args )
            {
                double nn = 6;
                double ss = 0;
                double mm = 0;

                for (int i = 1; i <= nn; i++)
                    {
                        System.out.println(i);
                        ss += i;
                    }

                System.out.println();
                System.out.println("Sum: " + ss);

                mm = ss / nn;
                System.out.println();
                System.out.println("Mathematical expectation: " + mm);
            }
    }
