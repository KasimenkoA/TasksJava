package Tasks.Tasks300;

public class Task258
    {
        public static void main( String[] args )
            {
                int nn = 0;

                for (int i = 1; i < 101; i++)
                    {
                        if (i%3 == 0)
                            {
                                System.out.println(i);
                                nn += i;
                            }
                    }

                System.out.println(nn);
            }
    }
