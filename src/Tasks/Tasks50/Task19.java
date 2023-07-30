package Tasks.Tasks50;

public class Task19
    {
        public static void main( String[] args )
            {
                int sum = 0;

                for (int i = 0; i < 30; i++)
                    {
                        for (int j = 0; j < 20; j++)
                            {
                                for (int k = 0; k < 10; k++)
                                    {
                                        sum += i*j*k;
                                    }
                            }
                    }

                System.out.println(sum);
            }
    }
