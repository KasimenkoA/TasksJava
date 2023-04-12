import java.util.Random;

public class Task4
    {
        public static void main( String[] args )
            {
                Random random = new Random();

                int n1 = random.nextInt(100);
                System.out.println(n1);

                int n2 = random.nextInt(100);
                System.out.println(n2);

                System.out.println();
                if (n1 > n2)
                    {
                        System.out.println("Число " + n1 + " больше!");
                    }
                else
                    {
                        System.out.println("Число " + n2 + " больше!");
                    }

            }
    }
