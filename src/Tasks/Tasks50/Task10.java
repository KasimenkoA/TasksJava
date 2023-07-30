package Tasks.Tasks50;

import java.util.Random;

public class Task10
    {
        public static void main( String[] args )
            {
                int[] mas = new int[100];

                Random random = new Random();
                for (int i = 0; i < mas.length; i++)
                    {
                        mas[i] = random.nextInt(100);
                    }

                int sum = 0;
                for (int mm : mas)
                    {
                        System.out.println(mm);
                        sum += mm;
                    }

                System.out.printf("Итого: %d",sum);
            }
    }
