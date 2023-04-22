import java.util.Random;

public class Task13
    {
        public static void main( String[] args )
            {
                String[] mas = new String[9];

                Random random = new Random();
                int nn = 0;

                for (int i = 0; i < mas.length; i++)
                    {
                        nn = random.nextInt(30);
                        if (nn>=0 && nn<=10) mas[i] = "Белый";
                        if (nn>=11 && nn<=20) mas[i] = "Синий";
                        if (nn>=21 && nn<=30) mas[i] = "Красный";
                    }

                for (int i = 0; i < mas.length; i++)
                    {
                        System.out.println(mas[i]);
                    }
            }
    }
