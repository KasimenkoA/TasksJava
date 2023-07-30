package Tasks.Tasks50;

public class Task20
    {
        public static void main( String[] args )
            {
                int mm = 0;

                for (int i = 2; i < 10; i++)
                    {
                        for (int j = 2; j < 10; j++)
                            {
                                mm = i*j;
                                System.out.printf("%d * %d = %2d\n",i,j,mm);
                            }
                    }
            }
    }
