package Tasks.Tasks50;

import java.util.Random;

public class Task17
    {
        public static void main( String[] args )
            {
                Random random = new Random();
                int nn = 0;
                String ss = "";

                for (int i = 0; i < 100; i++)
                    {
                        nn = random.nextInt(4);

                        switch (nn)
                            {
                                case 0:
                                    ss = "север";
                                    break;
                                case 1:
                                    ss = "юг";
                                    break;
                                case 2:
                                    ss = "запад";
                                    break;
                                case 3:
                                    ss = "восток";
                                    break;
                                default:
                                    ss = "не найдено";
                            }

                        System.out.printf("Число: %d - %s\n", nn, ss);
                    }
            }
    }
