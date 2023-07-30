package Tasks.Tasks50;

import java.util.Random;

public class Task7
    {
        public static void main( String[] args )
            {
                int nn_Sum = 0;
                int nn_Cur;
                int nn_Average;

                Random random = new Random();
                for (int i = 0; i < 10; i++)
                    {
                        nn_Cur = random.nextInt(100);
                        nn_Sum += nn_Cur;
                        System.out.println(nn_Cur);
                    }

                nn_Average = nn_Sum / 10;
                System.out.println("Average: " + nn_Average);
            }
    }
