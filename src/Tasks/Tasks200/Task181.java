package Tasks.Tasks200;

import java.util.Random;

public class Task181
    {
        public static void main( String[] args )
            {
                int nn;
                boolean even;
                Random random = new Random();

                for (int i = 0; i < 10; i++)
                    {
                        nn = random.nextInt(100);
                        even = (nn % 2 == 0)?true:false;

                        if (even)
                            {
                                System.out.println("Number: " + nn + " is even.");
                            }
                        else
                            {
                                System.out.println("Number: " + nn + " is not even.");
                            }
                    }
            }
    }
