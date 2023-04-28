import MyMethods.MyCollections;

public class Task38
    {
        public static void main( String[] args )
            {
                int[] mas = MyCollections.getMasRandomInteger( 100, 1000 );

                int nn_max = mas[0];
                int nn_min = mas[0];
                int nn_sum = 0;

                for (int i = 0; i < mas.length; i++)
                    {
                        if (mas[i]>nn_max) nn_max = mas[i];
                        if (mas[i]<nn_min) nn_min = mas[i];

                        nn_sum += mas[i];
                    }

                int nn_av = nn_sum/mas.length;

                System.out.println("Максимум: " + nn_max);
                System.out.println("Минимум: " + nn_min);
                System.out.println("Среднее: " + nn_av);
            }
    }
