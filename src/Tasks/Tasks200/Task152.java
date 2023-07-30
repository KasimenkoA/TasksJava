package Tasks.Tasks200;

public class Task152
    {
        public static void main( String[] args )
            {
                int even_sum = 0;

                for (int i = 1; i <= 10; i++)
                    {
                        if (i%2 == 0) even_sum += i;
                    }

                System.out.println("Sum: " + even_sum);
            }
    }
