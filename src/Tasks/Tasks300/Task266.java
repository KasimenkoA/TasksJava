package Tasks.Tasks300;

public class Task266
    {
        public static void main( String[] args )
            {
                int ss = 0;

                for (int i = 1; i <= 100; i++)
                    {
                        if (i%3 == 0)
                            {
                                System.out.println(i);
                                ss += i;
                            }
                    }

                System.out.println("Sum = " + ss);
            }
    }
