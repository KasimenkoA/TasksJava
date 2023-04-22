public class Task21
    {
        public static void main( String[] args )
            {
                int sum = 0;
                for (int i = 0; i < 100; i++)
                    {
                        if ((0<=i && i<=20) || (45<=i && i<=56) || (80<=i && i<=99)) sum += i;
                    }
                System.out.println(sum);
            }
    }
